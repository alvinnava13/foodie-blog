package edu.greenriver.it.foodieblog.controllers;

import edu.greenriver.it.foodieblog.services.RecipeService;
import edu.greenriver.it.foodieblog.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController
{
    private RecipeService service;

    public RecipeController(RecipeService service)
    {
        this.service = service;
    }

    @GetMapping("/recipes/all")
    public String all_recipes(Model model)
    {
        model.addAttribute("recipes", service.getRecipes());
        return "/recipes/all_recipes";
    }
}
