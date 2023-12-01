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

import com.example.demo.entities.Loja;
import com.example.demo.services.LojaService;

@RestController
@RequestMapping("/loja")
public class LojaController {

    @Autowired
    LojaService lojaService;
    
    @GetMapping("/{idLoja}")
    public Loja getLoja(@PathVariable Integer idLoja) {
        Loja loja = lojaService.getLoja(idLoja);
        return loja;
    }

    @PostMapping
    public void cadastrarLoja(@RequestBody Loja loja) {
        lojaService.salvar(loja);
    }

    @PutMapping
    public void atualizarLoja(@RequestBody Loja loja) {
        lojaService.atualizar(loja);
    }

    @DeleteMapping("/{idLoja}")
    public void removerLoja(@PathVariable Integer idLoja) {
        lojaService.remover(idLoja);
    }
}
