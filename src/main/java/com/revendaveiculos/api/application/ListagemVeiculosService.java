package com.revendaveiculos.api.application;

import com.revendaveiculos.api.domain.model.Veiculo;
import com.revendaveiculos.api.domain.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListagemVeiculosService {

    private final VeiculoRepository veiculoRepository;

    public ListagemVeiculosService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public List<Veiculo> listarDisponiveis() {
        return veiculoRepository.listarDisponiveisOrdenadoPorPreco();
    }

    public List<Veiculo> listarVendidos() {
        return veiculoRepository.listarVendidosOrdenadoPorPreco();
    }
}

