package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Pessoas;

public interface PessoasRepository extends JpaRepository<Pessoas, Integer>{
    
}
