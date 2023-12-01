package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Pessoas;
import com.example.demo.repositories.PessoasRepository;

@Service
public class PessoasService {
    
    @Autowired
    private PessoasRepository pessoasRepository;

    public Pessoas getPessoas(Integer idPessoas) {
        Optional<Pessoas> pessoas = pessoasRepository.findById(idPessoas);
        return pessoas.get();
    }

    public Pessoas salvar(Pessoas pessoas) {
        return pessoasRepository.save(pessoas);
    }

    public Pessoas atualizar(Pessoas pessoas) {
        return pessoasRepository.save(pessoas);
    }

    public void remover(Integer idPessoas) {
        pessoasRepository.deleteById(idPessoas);
    }


}