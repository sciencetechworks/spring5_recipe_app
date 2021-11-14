/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stw.spring5_recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Usuario
 */
@Controller
public class IndexController {
    
    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        return "index";
    }
}
