package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Desconto;
import com.example.demo.repositories.DescontoRepository;

@Service
public class DescontoService {
    
    @Autowired
    private DescontoRepository descontoRepository;

    public Desconto getDesconto(Integer idDesconto) {
        Optional<Desconto> desconto = descontoRepository.findById(idDesconto);
        return desconto.get();
    }

    public Desconto salvar(Desconto desconto) {
        return descontoRepository.save(desconto);
    }

    public Desconto atualizar(Desconto desconto) {
        return descontoRepository.save(desconto);
    }

    public void remover(Integer idDesconto) {
        descontoRepository.deleteById(idDesconto);
    }


}