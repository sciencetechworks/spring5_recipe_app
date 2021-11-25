/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stw.spring5_recipe_app.domain;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Usuario
 */
@Getter
@Setter
@EqualsAndHashCode(exclude={"recipe"})
@Entity
public class Ingredient {
  
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    private String description;
    private BigDecimal amount;
    
    @OneToOne(fetch = FetchType.EAGER) //default behaviour is EAGER already
    private UnitOfMeasure uom;
    
    @ManyToOne
    private Recipe recipe;

    public Ingredient() {
    }

    
    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe=recipe;
    }
}
