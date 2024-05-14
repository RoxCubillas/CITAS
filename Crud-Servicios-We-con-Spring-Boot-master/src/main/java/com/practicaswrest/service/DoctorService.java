/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.service;
import com.practicaswrest.entity.Doctor;
import com.practicaswrest.repo.DoctorRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
     @Autowired
    private DoctorRepo doctorrepo;
    
    public Doctor insertar(Doctor emp){
        return doctorrepo.saveAndFlush(emp);
    }
    
    public Doctor actualizar(Doctor emp){
        return doctorrepo.save(emp);
    }
    
    public List<Doctor> listar(){
        return doctorrepo.findAll();
    }
    
    public void eliminar(Doctor emp){
        doctorrepo.delete(emp);
    }
}
