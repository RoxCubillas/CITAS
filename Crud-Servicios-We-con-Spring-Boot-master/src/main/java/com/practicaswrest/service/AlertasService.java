/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.service;

import com.practicaswrest.entity.Alertas;
import com.practicaswrest.repo.AlertasRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertasService {
      @Autowired
    private AlertasRepo alertasrepo;
    
    public Alertas insertar(Alertas emp){
        return alertasrepo.saveAndFlush(emp);
    }
    
    public Alertas actualizar(Alertas emp){
        return alertasrepo.save(emp);
    }
    
    public List<Alertas> listar(){
        return alertasrepo.findAll();
    }
    
    public void eliminar(Alertas emp){
        alertasrepo.delete(emp);
    }
}
