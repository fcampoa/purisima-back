/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purisima.purisima.repositories;

import com.purisima.purisima.modelos.Prueba;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author felix
 */
@Repository
public interface IPruebaRepository extends CrudRepository<Prueba, Integer>{
    
}
