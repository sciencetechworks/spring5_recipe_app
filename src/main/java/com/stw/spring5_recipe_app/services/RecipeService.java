package com.stw.spring5_recipe_app.services;

import com.stw.spring5_recipe_app.commands.RecipeCommand;
import com.stw.spring5_recipe_app.domain.Recipe;
import java.util.Set;

/**
 *
 * @author Usuario
 */

public interface RecipeService {
    
   Set<Recipe> getRecipes();
   
   Recipe getRecipeById(Long id);
   
   RecipeCommand findCommandById(Long l);
   
   RecipeCommand saveRecipeCommand(RecipeCommand command);
   
   void deleteById(Long idToDelete);
}
