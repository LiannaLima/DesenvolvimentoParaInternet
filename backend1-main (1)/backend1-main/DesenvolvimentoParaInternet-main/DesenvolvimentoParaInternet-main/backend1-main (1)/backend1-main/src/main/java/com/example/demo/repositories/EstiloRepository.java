package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Estilo;

public interface EstiloRepository extends JpaRepository<Estilo, Integer>{
    
}
