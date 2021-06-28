/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purisima.purisima.servicios.impl;

import com.purisima.purisima.modelos.Prueba;
import com.purisima.purisima.servicios.IPruebaService;
import com.purisima.purisima.repositories.IPruebaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author felix
 */
@Service
public class PruebaService implements IPruebaService{
    
    @Autowired
    private IPruebaRepository pruebaRepository;

    @Override
    public List<Prueba> getAll() {
       return (List) this.pruebaRepository.findAll();
    }
    
}
