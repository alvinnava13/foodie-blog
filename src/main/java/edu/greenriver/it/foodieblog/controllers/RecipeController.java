package edu.greenriver.it.foodieblog.controllers;

import edu.greenriver.it.foodieblog.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController
{
    private UserService service;

    public RecipeController(UserService service)
    {
        this.service = service;
    }

    @GetMapping("/recipes/all")
    public String all_recipes(Model model)
    {

        return "";
    }
}
