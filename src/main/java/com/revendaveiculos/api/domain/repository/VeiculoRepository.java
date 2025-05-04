package com.revendaveiculos.api.domain.repository;

import com.revendaveiculos.api.domain.model.Veiculo;
import java.util.List;
import java.util.Optional;


public interface VeiculoRepository {
    List<Veiculo> listarDisponiveisOrdenadoPorPreco();
    List<Veiculo> listarVendidosOrdenadoPorPreco();
    Veiculo salvar(Veiculo veiculo);
    Optional<Veiculo> buscarPorId(Long id);
}