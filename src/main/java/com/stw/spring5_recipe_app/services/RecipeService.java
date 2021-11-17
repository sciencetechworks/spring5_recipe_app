package com.stw.spring5_recipe_app.services;

import com.stw.spring5_recipe_app.domain.Recipe;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

public interface RecipeService {
   Set<Recipe> getRecipes(); 
}
