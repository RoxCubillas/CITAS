/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.repo;
import com.practicaswrest.entity.Alertas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertasRepo extends JpaRepository<Alertas, Integer> {
    
}
