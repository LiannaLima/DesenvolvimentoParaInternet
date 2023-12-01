package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Estilo;
import com.example.demo.repositories.EstiloRepository;

@Service
public class EstiloService {
    
    @Autowired
    private EstiloRepository estiloRepository;

    public Estilo getEstilo(Integer idEstilo) {
        Optional<Estilo> estilo = estiloRepository.findById(idEstilo);
        return estilo.get();
    }

    public Estilo salvar(Estilo estilo) {
        return estiloRepository.save(estilo);
    }

    public Estilo atualizar(Estilo estilo) {
        return estiloRepository.save(estilo);
    }

    public void remover(Integer idEstilo) {
        estiloRepository.deleteById(idEstilo);
    }


}
