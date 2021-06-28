/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purisima.purisima.servicios;

import com.purisima.purisima.modelos.Prueba;
import java.util.List;

/**
 *
 * @author felix
 */
public interface IPruebaService {
    
    List<Prueba> getAll();
    Prueba add(Prueba prueba);
    Prueba get(Integer id);
    Prueba update(Prueba prueba);
    void delete(Prueba prueba);
}
