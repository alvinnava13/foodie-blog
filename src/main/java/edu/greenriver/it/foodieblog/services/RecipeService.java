package edu.greenriver.it.foodieblog.services;

import edu.greenriver.it.foodieblog.model.Recipe;
import edu.greenriver.it.foodieblog.repositories.IRecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeService
{
    private IRecipeRepository recipeRepository;

    public RecipeService(IRecipeRepository recipeService)
    {
        this.recipeRepository = recipeService;
    }

    public Iterable<Recipe> getRecipes()
    {
        return recipeRepository.findAll();
    }
}
