/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.controller;

import com.practicaswrest.entity.Alertas;
import com.practicaswrest.service.AlertasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alertas")
public class AlertasController {
      @Autowired
    private AlertasService alertasservice;
    
    @GetMapping
    public List<Alertas> listar(){
        return alertasservice.listar();
    }
    
    @PostMapping
    public Alertas insertar(@RequestBody Alertas emp){
        Alertas d= new Alertas();
        if (emp.getCodigo()==null) {
           d=  alertasservice.insertar(emp);
        }
        return d;
    }
    
    @PutMapping
    public Alertas actualizar(@RequestBody Alertas emp){
        return alertasservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Alertas emp){
        alertasservice.eliminar(emp);
    }  
}
