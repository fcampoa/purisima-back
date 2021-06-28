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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author felix
 */
@RestController
@RequestMapping(path = "api/prueba")
@CrossOrigin(origins = "*", methods = {
    RequestMethod.GET,
    RequestMethod.POST,
    RequestMethod.PUT,
    RequestMethod.DELETE})
public class PruebaController {

    @Autowired
    private IPruebaService pruebaService;

    @GetMapping(produces = "application/json", value = "/getAll")
    public ResponseEntity<List<Prueba>> GetAll() {
        return new ResponseEntity(this.pruebaService.getAll(), HttpStatus.OK);
    }

    @PostMapping(produces = "application/json", value = "/add")
    public ResponseEntity<Prueba> Add(@RequestBody Prueba prueba) {
        return new ResponseEntity(this.pruebaService.add(prueba), HttpStatus.OK);
    }

    @GetMapping(produces = "application/json", value = "/get/{id}")
    public ResponseEntity<Prueba> Get(@PathVariable Integer id) {
        return new ResponseEntity(this.pruebaService.get(id), HttpStatus.OK);
    }

    @DeleteMapping(produces = "application/json", value = "/delete")
    public ResponseEntity<String> Delete(@RequestBody Prueba prueba) {
        try {
            this.pruebaService.delete(prueba);
            return new ResponseEntity("Eliminado", HttpStatus.OK);
        } catch (Exception e) {
        }
        return new ResponseEntity("Error", HttpStatus.BAD_REQUEST);
    }

    @PutMapping(produces = "application/json", value = "/edit")
    public ResponseEntity<Prueba> Edit(@RequestBody Prueba prueba) {
        return new ResponseEntity(this.pruebaService.update(prueba), HttpStatus.OK);
    }
}
