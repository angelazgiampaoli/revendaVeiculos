package com.revendaveiculos.api.infrastructure.persistence;

import com.revendaveiculos.api.domain.model.Veiculo;
import com.revendaveiculos.api.domain.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class VeiculoRepositoryImpl implements VeiculoRepository {

    @Autowired
    private SpringDataVeiculoRepository jpa;

    @Override
    public List<Veiculo> listarDisponiveisOrdenadoPorPreco() {
        return jpa.findByVendidoFalseOrderByPrecoAsc();
    }

    @Override
    public List<Veiculo> listarVendidosOrdenadoPorPreco() {
        return jpa.findByVendidoTrueOrderByPrecoAsc();
    }

    @Override
    public Veiculo salvar(Veiculo veiculo) {
        return jpa.save(veiculo);
    }

    @Override
    public Optional<Veiculo> buscarPorId(Long id) {
        return jpa.findById(id);
    }
}