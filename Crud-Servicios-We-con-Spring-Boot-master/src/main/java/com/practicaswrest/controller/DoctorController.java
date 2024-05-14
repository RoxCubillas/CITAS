/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.controller;

import com.practicaswrest.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.practicaswrest.entity.Doctor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/doctores")
@CrossOrigin(origins = "*")

public class DoctorController {
     @Autowired
    private DoctorService doctorservice;
    
    @GetMapping
    public List<Doctor> listar(){
        return doctorservice.listar();
    }
    
    @PostMapping
    public Doctor insertar(@RequestBody Doctor emp){
        Doctor d= new Doctor();
        if (emp.getCodigo()==null) {
           d=  doctorservice.insertar(emp);
        }
        return d;
    }
    @GetMapping("/especialidades")
    public List<String> listarEspecialidades(){
        List<Doctor> d= new ArrayList<>();
         d= doctorservice.listar();
        List<String> milista= new ArrayList<>();
        int cant=milista.size();
        for (Doctor doctor : d) {
            if (cant>0) {
                for (int i = 0; i <= cant; i++) {
                    if (milista.get(i).equals(doctor.getEspecialidad())) {
                        milista.add(doctor.getEspecialidad());
                        cant=milista.size();
                    }
                }
            }else{
              milista.add(doctor.getEspecialidad());
            }
        }
        
        return milista;
    }
    
    @PutMapping
    public Doctor actualizar(@RequestBody Doctor emp){
        return doctorservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Doctor emp){
        doctorservice.eliminar(emp);
    }
}
