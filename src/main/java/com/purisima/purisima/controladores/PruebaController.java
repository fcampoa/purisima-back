/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purisima.purisima.controladores;

import com.purisima.purisima.modelos.Prueba;
import com.purisima.purisima.servicios.IPruebaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author felix
 */
@RestController
@RequestMapping(path = "/prueba")
public class PruebaController {
    
    @Autowired
    private IPruebaService pruebaService;
    
    @GetMapping(produces = "application/json", value = "/getAll")
    public List<Prueba> GetAll() {
        return this.pruebaService.getAll();             
    }
    
    
    
}
