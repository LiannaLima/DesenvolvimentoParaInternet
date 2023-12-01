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

import com.example.demo.entities.Desconto;
import com.example.demo.services.DescontoService;

@RestController
@RequestMapping("/desconto")
public class DescontoController {

    @Autowired
    DescontoService descontoService;
    
    @GetMapping("/{idDesconto}")
    public Desconto getDesconto(@PathVariable Integer idDesconto) {
        Desconto desconto = descontoService.getDesconto(idDesconto);
        return desconto;
    }

    @PostMapping
    public void cadastrarDesconto(@RequestBody Desconto desconto) {
        descontoService.salvar(desconto);
    }

    @PutMapping
    public void atualizarDesconto(@RequestBody Desconto desconto) {
        descontoService.atualizar(desconto);
    }

    @DeleteMapping("/{idDesconto}")
    public void removerDesconto(@PathVariable Integer idDesconto) {
        descontoService.remover(idDesconto);
    }
}
