package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.domain.User;
import pl.coderslab.service.UserService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin/users")
public class MenageUserController {

    private final UserService userService;

    public MenageUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public String showPosts(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "/users/all";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddForm(Model model){
        model.addAttribute("user", new User());
        return "users/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "users/add";
        }
        userService.add(user);
        return "redirect:/admin/users/all";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showEditForm(@PathVariable long id, Model model) {
        model.addAttribute("user", userService.get(id));
        return "users/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "users/edit";
        }
        userService.add(user);
        return "redirect:/admin/users/all";
    }

    @GetMapping("/confirm/{id}")
    public String showUser(Model model, @PathVariable long id) {
        model.addAttribute("user", userService.get(id).orElseThrow(EntityNotFoundException::new));
        return "users/confirm";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(Model model, @PathVariable long id) {
        userService.delete(id);
        return "redirect:/admin/users/all";
    }

}
