package com.revendaveiculos.api.web;

import com.revendaveiculos.api.application.CadastroVeiculoService;
import com.revendaveiculos.api.application.ListagemVeiculosService;
import com.revendaveiculos.api.domain.model.Veiculo;

import java.util.List;

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
    private ListagemVeiculosService listagemVeiculosService;

    @PostMapping
    public ResponseEntity<Veiculo> cadastrar(@RequestBody @Valid Veiculo veiculo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastroVeiculoService.cadastrar(veiculo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> editar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        return ResponseEntity.ok(cadastroVeiculoService.editar(id, veiculo));
    }

    @GetMapping("/disponiveis")
    public ResponseEntity<List<Veiculo>> listarDisponiveis() {
        return ResponseEntity.ok(listagemVeiculosService.listarDisponiveis());
    }

    @GetMapping("/vendidos")
    public ResponseEntity<List<Veiculo>> listarVendidos() {
        return ResponseEntity.ok(listagemVeiculosService.listarVendidos());
    }
}