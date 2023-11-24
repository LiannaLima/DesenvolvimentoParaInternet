package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Pessoas;
import com.example.demo.services.PessoasService;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {

    @Autowired
    PessoasService pessoasService;
    
    @GetMapping("/{idPessoas}")
    public Pessoas getPessoas(@PathVariable Integer idPessoas) {
        Pessoas pessoas = pessoasService.getPessoas(idPessoas);
        return pessoas;
    }

    @PostMapping
    public void cadastrarPessoas(@RequestBody Pessoas pessoas) {
        pessoasService.salvar(pessoas);
    }

    @PutMapping
    public void atualizarPessoas(@RequestBody Pessoas pessoas) {
        pessoasService.atualizar(pessoas);
    }

    @DeleteMapping("/{idPessoas}")
    public void removerPessoas(@PathVariable Integer idPessoas) {
        pessoasService.remover(idPessoas);
    }
}
