package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Preço;
import com.example.demo.repositories.PreçoRepository;

@Service
public class PreçoService {
    
    @Autowired
    private PreçoRepository preçoRepository;

    public Preço getPreço(Integer idPreço) {
        Optional<Preço> preço = preçoRepository.findById(idPreço);
        return preço.get();
    }

    public Preço salvar(Preço preço) {
        return preçoRepository.save(preço);
    }

    public Preço atualizar(Preço preço) {
        return preçoRepository.save(preço);
    }

    public void remover(Integer idPreço) {
        preçoRepository.deleteById(idPreço);
    }


}