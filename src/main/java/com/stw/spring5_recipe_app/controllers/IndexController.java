/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stw.spring5_recipe_app.controllers;

import com.stw.spring5_recipe_app.domain.Category;
import com.stw.spring5_recipe_app.domain.UnitOfMeasure;
import com.stw.spring5_recipe_app.repositories.CategoryRepository;
import com.stw.spring5_recipe_app.repositories.UnitOfMeasureRepository;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Usuario
 */
@Controller
public class IndexController {
    
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }
    
    
    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        
        System.out.println("Cat Id is:"+categoryOptional.get().getId());
        System.out.println("UOM Id is:"+unitOfMeasureOptional.get().getId());
        return "index";
    }
}
