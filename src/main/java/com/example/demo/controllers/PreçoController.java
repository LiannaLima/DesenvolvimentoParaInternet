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

import com.example.demo.entities.Preço;
import com.example.demo.services.PreçoService;

@RestController
@RequestMapping("/preço")
public class PreçoController {

    @Autowired
    PreçoService preçoService;
    
    @GetMapping("/{idPreço}")
    public Preço getPreço(@PathVariable Integer idPreço) {
        Preço preço = preçoService.getPreço(idPreço);
        return preço;
    }

    @PostMapping
    public void cadastrarPreço(@RequestBody Preço preço) {
        preçoService.salvar(preço);
    }

    @PutMapping
    public void atualizarPreço(@RequestBody Preço preço) {
        preçoService.atualizar(preço);
    }

    @DeleteMapping("/{idPreço}")
    public void removerPreço(@PathVariable Integer idPreço) {
        preçoService.remover(idPreço);
    }
}