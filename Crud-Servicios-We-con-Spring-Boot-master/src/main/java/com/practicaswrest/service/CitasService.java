/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.service;

import com.practicaswrest.entity.Citas;
import com.practicaswrest.repo.CitasRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitasService {
    @Autowired
    private CitasRepo citasrepo;
    
    public Citas insertar(Citas emp){
        return citasrepo.saveAndFlush(emp);
    }
    
    public Citas actualizar(Citas emp){
        return citasrepo.save(emp);
    }
    
    public List<Citas> listar(){
        return citasrepo.findAll();
    }
    
    public void eliminar(Citas emp){
        citasrepo.delete(emp);
    }  
}
