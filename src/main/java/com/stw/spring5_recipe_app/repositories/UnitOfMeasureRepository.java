/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.stw.spring5_recipe_app.repositories;

import com.stw.spring5_recipe_app.domain.UnitOfMeasure;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface UnitOfMeasureRepository 
        extends CrudRepository<UnitOfMeasure, Long>{
    Optional<UnitOfMeasure> findByDescription(String description);
}
