package com.stw.spring5_recipe_app.controllers;

import com.stw.spring5_recipe_app.services.RecipeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import static org.mockito.Mockito.*;

/**
 *
 * @author Usuario
 */
public class IndexControllerTest {
    
    @Mock
    RecipeService recipeService;
    @Mock
    Model model;
    
    IndexController controller;
    
    public IndexControllerTest() {
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
        
        controller = new IndexController(recipeService);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getIndexPage method, of class IndexController.
     */
    @Test
    public void testGetIndexPage() {
        System.out.println("getIndexPage");
        
        IndexController instance = controller;
        String expResult = "index";
        String result = instance.getIndexPage(model);
        assertEquals(expResult, result);
        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute(eq("recipes"),anySet());
    }
    
}