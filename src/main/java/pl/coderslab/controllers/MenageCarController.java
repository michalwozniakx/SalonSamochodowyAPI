package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.domain.Car;

import pl.coderslab.service.CarService;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin/cars")
public class MenageCarController {

    private final CarService carService;

    public MenageCarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(value = "/add/{id}", method = RequestMethod.GET)
    public String showAddForm(@PathVariable long id, Model model){
        model.addAttribute("car", carService.get(id));
        return "cars/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveCar(@Valid Car car, BindingResult result) {
        if (result.hasErrors()) {
            return "cars/add";
        }
        carService.add(car);
        return "redirect:/admin/users/all";
    }
}
