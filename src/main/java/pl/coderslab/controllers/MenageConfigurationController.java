package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.domain.Configuration;
import pl.coderslab.service.ConfigurationService;
import javax.validation.Valid;

@Controller
@RequestMapping("/admin/cars")
public class MenageConfigurationController {

    private final ConfigurationService configurationService;

    public MenageConfigurationController(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @RequestMapping(value = "/configuration/{id}", method = RequestMethod.GET)
    public String showAddForm(@PathVariable long id, Model model){
        model.addAttribute("configuration", configurationService.get(id));
        return "cars/configuration";
    }

    @RequestMapping(value = "/configuration", method = RequestMethod.POST)
    public String saveConfiguration(@Valid Configuration configuration, BindingResult result) {
        if (result.hasErrors()) {
            return "cars/configuration";
        }
        configurationService.add(configuration);
        return "redirect:/admin/users/all";
    }
}
