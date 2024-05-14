/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.controller;
import com.practicaswrest.entity.Paciente;
import com.practicaswrest.service.PacienteService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pacientes")
@CrossOrigin(origins = "*")

public class PacienteController {
    @Autowired 
    private PacienteService pacienteservice;
    
    @GetMapping
    public List<Paciente> listar(){
        return pacienteservice.listar();
    }
    
    @PostMapping
    public Paciente insertar(@RequestBody Paciente emp){
        return pacienteservice.insertar(emp);
    }
    
    @PutMapping
    public Paciente actualizar(@RequestBody Paciente emp){
        return pacienteservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Paciente emp){
        pacienteservice.eliminar(emp);
    }
}
