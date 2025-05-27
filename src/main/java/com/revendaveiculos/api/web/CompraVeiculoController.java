package com.revendaveiculos.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revendaveiculos.api.application.CadastroVeiculoService;
import com.revendaveiculos.api.domain.model.Veiculo;

@RestController
@RequestMapping("/veiculos")
public class CompraVeiculoController {

    @Autowired
    private CadastroVeiculoService cadastroVeiculoService;

     
    @PostMapping("/comprar/{id}")
    public ResponseEntity<String> comprar(@PathVariable Long id) {
 
    Veiculo veiculo = cadastroVeiculoService.buscarPorId(id);
    
    if (veiculo == null) {
        return ResponseEntity.notFound().build();
    }

    veiculo.setVendido(true);
    cadastroVeiculoService.cadastrar(veiculo);

    return ResponseEntity.ok("Compra realizada com sucesso!");
}

}

