/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.repo;
import com.practicaswrest.entity.Citas;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CitasRepo extends JpaRepository<Citas, Integer> {
    
}
