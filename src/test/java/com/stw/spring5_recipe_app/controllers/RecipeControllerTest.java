/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.stw.spring5_recipe_app.controllers;

import com.stw.spring5_recipe_app.domain.Recipe;
import com.stw.spring5_recipe_app.services.RecipeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 *
 * @author Usuario
 */
public class RecipeControllerTest {
    
    @Mock 
    RecipeService recipeService;
    
    RecipeController controller;
    
    public RecipeControllerTest() {
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
        
        controller=new RecipeController(recipeService);
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() throws Exception {
        Recipe recipe = new Recipe();
        recipe.setId(1L);
        
        MockMvc mockMvc= MockMvcBuilders.standaloneSetup(controller).build();
        
        when(recipeService.getRecipeById(anyLong())).thenReturn(recipe);
        
        mockMvc.perform(get("/recipe/show/1")).
                andExpect(status().isOk()).
                andExpect(view().name("recipe/show")).
                andExpect(model().attributeExists("recipe"));
    }
    
}
