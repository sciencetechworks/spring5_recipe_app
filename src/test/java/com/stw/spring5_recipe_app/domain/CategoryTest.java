/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.stw.spring5_recipe_app.domain;

import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class CategoryTest {
    
    public CategoryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Category.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Category instance = new Category();
        instance.setId(4L);
        Long expResult = 4L;
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Category.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Category instance = new Category();
        instance.setDescription("DESCRIPTION");
        String expResult = "DESCRIPTION";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRecipes method, of class Category.
     */
    @Test
    public void testGetRecipes() {
        System.out.println("getRecipes");
        Category instance = new Category();
        Set<Recipe> expResult = null;
        Set<Recipe> result = instance.getRecipes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Category.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Category instance = new Category();
        instance.setId(id);
        assertEquals(instance.getId(), id);
    }

    /**
     * Test of setDescription method, of class Category.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Category instance = new Category();
        instance.setDescription(description);
        assertEquals(instance.getDescription(), description);
    }

    /**
     * Test of setRecipes method, of class Category.
     */
    @Test
    public void testSetRecipes() {
        System.out.println("setRecipes");
        Set<Recipe> recipes = null;
        Category instance = new Category();
        instance.setRecipes(recipes);
        assertEquals(instance.getRecipes(), recipes);
    }

    
}
