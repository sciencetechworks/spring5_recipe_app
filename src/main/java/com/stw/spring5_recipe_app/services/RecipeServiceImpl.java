package com.stw.spring5_recipe_app.services;

import com.stw.spring5_recipe_app.commands.RecipeCommand;
import com.stw.spring5_recipe_app.converters.RecipeCommandToRecipe;
import com.stw.spring5_recipe_app.converters.RecipeToRecipeCommand;
import com.stw.spring5_recipe_app.domain.Recipe;
import com.stw.spring5_recipe_app.exceptions.NotFoundException;
import com.stw.spring5_recipe_app.repositories.RecipeRepository;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService{
    
    private final RecipeRepository recipeRepository;
    private final RecipeCommandToRecipe recipeCommandToRecipe;
    private final RecipeToRecipeCommand recipeToRecipeCommand;

    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeCommandToRecipe recipeCommandToRecipe, RecipeToRecipeCommand recipeToRecipeCommand) {
        this.recipeRepository = recipeRepository;
        this.recipeCommandToRecipe = recipeCommandToRecipe;
        this.recipeToRecipeCommand = recipeToRecipeCommand;
    }
    

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm in the service");
        Set<Recipe> recipeSet = new HashSet<>();  
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
    
    @Override
    public Recipe getRecipeById(Long id) {
        log.debug("I'm in the service");
        Optional<Recipe> recipeOptional= recipeRepository.findById(id);
        
        if (!recipeOptional.isPresent()){
            throw new NotFoundException("Recipe Not Found. For Id value: "+id);
        }
        return recipeOptional.get();
    }

    
    @Override
    @Transactional 
    public RecipeCommand findCommandById(Long l) {
        return recipeToRecipeCommand.convert(getRecipeById(l));
    }
    
    @Override
    @Transactional 
    public RecipeCommand saveRecipeCommand(RecipeCommand command) {
        Recipe detachedRecipe = recipeCommandToRecipe.convert(command);
        
        Recipe savedRecipe = recipeRepository.save(detachedRecipe);
        log.debug("Saved RecipeId:"+ savedRecipe.getId());
        return recipeToRecipeCommand.convert(savedRecipe);
    }

    @Override
    public void deleteById(Long idToDelete) {
        recipeRepository.deleteById(idToDelete);
    }

}
