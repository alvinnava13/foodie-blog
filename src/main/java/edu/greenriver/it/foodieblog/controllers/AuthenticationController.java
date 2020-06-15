package edu.greenriver.it.foodieblog.controllers;

import edu.greenriver.it.foodieblog.model.User;
import edu.greenriver.it.foodieblog.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController
{
    private UserService service;

    public AuthenticationController(UserService service)
    {
        this.service = service;
    }

    @GetMapping("/register")
    public String register(Model model)
    {
        model.addAttribute("user", new User());
        return "/general/register";
    }

    @GetMapping("/login")
    public String login()
    {
        return "/general/login";
    }
}
