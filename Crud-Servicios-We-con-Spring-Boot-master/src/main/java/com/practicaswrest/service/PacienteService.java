/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.service;
import com.practicaswrest.entity.Paciente;
import com.practicaswrest.repo.PacienteRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
     @Autowired
    private PacienteRepo pacienterepo;
    
    public Paciente insertar(Paciente emp){
        return pacienterepo.saveAndFlush(emp);
    }
    
    public Paciente actualizar(Paciente emp){
        return pacienterepo.save(emp);
    }
    
    public List<Paciente> listar(){
        return pacienterepo.findAll();
    }
    
    public void eliminar(Paciente emp){
        pacienterepo.delete(emp);
    }
}
