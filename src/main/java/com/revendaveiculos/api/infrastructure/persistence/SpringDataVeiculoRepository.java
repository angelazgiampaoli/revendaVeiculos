package com.revendaveiculos.api.infrastructure.persistence;

import com.revendaveiculos.api.domain.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface SpringDataVeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByVendidoFalseOrderByPrecoAsc();
    List<Veiculo> findByVendidoTrueOrderByPrecoAsc();
}