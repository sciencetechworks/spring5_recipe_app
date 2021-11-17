/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stw.spring5_recipe_app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 *
 * @author Usuario
 */
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    private Recipe recipe;
    
    @Lob
    private String recipeNotes;

    public Notes() {
    }

    
    public Notes(Recipe recipe) {
        this.recipe = recipe;
    }

    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the recipe
     */
    public Recipe getRecipe() {
        return recipe;
    }

    /**
     * @param recipe the recipe to set
     */
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    /**
     * @return the recipeNotes
     */
    public String getRecipeNotes() {
        return recipeNotes;
    }

    /**
     * @param recipeNotes the recipeNotes to set
     */
    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
    
    
}
