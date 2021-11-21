package com.stw.spring5_recipe_app.services;

import com.stw.spring5_recipe_app.domain.Recipe;
import com.stw.spring5_recipe_app.repositories.RecipeRepository;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Usuario
 */
public class RecipeServiceImplTest {
    
    RecipeServiceImpl recipeService;
    
    @Mock
    RecipeRepository recipeRepository;
    
    public RecipeServiceImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getRecipes method, of class RecipeServiceImpl.
     */
    @Test
    public void testGetRecipes() {
        System.out.println("getRecipes");
        
        Recipe recipe=new Recipe();
        HashSet recipesData= new HashSet();
        recipesData.add(recipe);
        
        when(recipeRepository.findAll()).thenReturn(recipesData);
        
        RecipeServiceImpl instance = recipeService;
        Set<Recipe> result = instance.getRecipes();
        int expResult =1 ;
        assertEquals(expResult, result.size());
        verify(recipeRepository , times(1)).findAll();
    }
    
}
