package edu.greenriver.it.foodieblog.controllers;

import edu.greenriver.it.foodieblog.model.User;
import edu.greenriver.it.foodieblog.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController
{
    private UserService service;

    public UserController(UserService service)
    {
        this.service = service;
    }

    /*@GetMapping("/all")
    public String allUsers()
    {
        return "/users/all_users";
    }*/

    @GetMapping("/username/{username}")
    public String userByUsername(@PathVariable String username, Model model)
    {
        model.addAttribute("user", service.getUser(username));

        return "/users/user";
    }
}
