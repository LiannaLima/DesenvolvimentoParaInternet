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

import com.example.demo.entities.Estilo;
import com.example.demo.services.EstiloService;

@RestController
@RequestMapping("/estilo")
public class EstiloController {

    @Autowired
    EstiloService estiloService;
    
    @GetMapping("/{idEstilo}")
    public Estilo getEstilo(@PathVariable Integer idEstilo) {
        Estilo estilo = estiloService.getEstilo(idEstilo);
        return estilo;
    }

    @PostMapping
    public void cadastrarEstilo(@RequestBody Estilo estilo) {
        estiloService.salvar(estilo);
    }

    @PutMapping
    public void atualizarEstilo(@RequestBody Estilo estilo) {
        estiloService.atualizar(estilo);
    }

    @DeleteMapping("/{idEstilo}")
    public void removerEstilo(@PathVariable Integer idEstilo) {
        estiloService.remover(idEstilo);
    }
}