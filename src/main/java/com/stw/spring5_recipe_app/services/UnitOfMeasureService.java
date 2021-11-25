/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.stw.spring5_recipe_app.services;

import com.stw.spring5_recipe_app.commands.UnitOfMeasureCommand;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
