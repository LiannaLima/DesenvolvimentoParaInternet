package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Desconto;

public interface DescontoRepository extends JpaRepository<Desconto, Integer>{
    
}
