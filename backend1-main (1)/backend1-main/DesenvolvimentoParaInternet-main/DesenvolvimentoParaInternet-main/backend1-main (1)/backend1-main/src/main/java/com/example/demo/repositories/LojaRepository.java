package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Loja;

public interface LojaRepository extends JpaRepository<Loja, Integer>{
    
}
