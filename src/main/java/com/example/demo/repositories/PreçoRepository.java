package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Preço;

public interface PreçoRepository extends JpaRepository<Preço, Integer>{
    
}