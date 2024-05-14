/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.controller;

import com.practicaswrest.entity.Citas;
import com.practicaswrest.service.CitasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/citas")
@CrossOrigin(origins = "*")

public class CitasController {
      @Autowired
    private CitasService citasservice;
    
    @GetMapping
    public List<Citas> listar(){
        return citasservice.listar();
    }
    
    @PostMapping
    public Citas insertar(@RequestBody Citas emp){
        Citas d= new Citas();
        if (emp.getCodigo()==null) {
           d=  citasservice.insertar(emp);
        }
        return d;
    }
    
 
    @PostMapping("/mensajes")
    public String mensaje(@RequestBody Citas emp){
          

       
       
        return "por implementar";
    }
    
    @PutMapping
    public Citas actualizar(@RequestBody Citas emp){
        return citasservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Citas emp){
        citasservice.eliminar(emp);
    }
}
