package com.revendaveiculos.api.web;

import com.revendaveiculos.api.application.CadastroVeiculoService;
import com.revendaveiculos.api.domain.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private CadastroVeiculoService cadastroVeiculoService;

    @PostMapping
    public ResponseEntity<Veiculo> cadastrar(@RequestBody @Valid Veiculo veiculo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastroVeiculoService.cadastrar(veiculo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> editar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        return ResponseEntity.ok(cadastroVeiculoService.editar(id, veiculo));
    }
}