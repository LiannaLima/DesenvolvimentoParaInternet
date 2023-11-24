package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Loja;
import com.example.demo.repositories.LojaRepository;

@Service
public class LojaService {
    
    @Autowired
    private LojaRepository lojaRepository;

    public Loja getLoja(Integer idLoja) {
        Optional<Loja> loja = lojaRepository.findById(idLoja);
        return loja.get();
    }

    public Loja salvar(Loja loja) {
        return lojaRepository.save(loja);
    }

    public Loja atualizar(Loja loja) {
        return lojaRepository.save(loja);
    }

    public void remover(Integer idLoja) {
        lojaRepository.deleteById(idLoja);
    }


}
