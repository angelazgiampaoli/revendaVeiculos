package com.revendaveiculos.api.application;

import com.revendaveiculos.api.domain.model.Veiculo;
import com.revendaveiculos.api.domain.repository.VeiculoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ListagemVeiculosServiceTest {

    @Mock
    private VeiculoRepository veiculoRepository;

    @InjectMocks
    private ListagemVeiculosService listagemVeiculosService;

    private AutoCloseable closeable;

    @BeforeEach
    void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void deveListarVeiculosDisponiveis() {
        List<Veiculo> veiculos = Arrays.asList(new Veiculo(), new Veiculo());
        when(veiculoRepository.listarDisponiveisOrdenadoPorPreco()).thenReturn(veiculos);

        List<Veiculo> resultado = listagemVeiculosService.listarDisponiveis();

        assertEquals(2, resultado.size());
        verify(veiculoRepository).listarDisponiveisOrdenadoPorPreco();
    }

    @Test
    void deveListarVeiculosVendidos() {
        List<Veiculo> veiculos = Arrays.asList(new Veiculo());
        when(veiculoRepository.listarVendidosOrdenadoPorPreco()).thenReturn(veiculos);

        List<Veiculo> resultado = listagemVeiculosService.listarVendidos();

        assertEquals(1, resultado.size());
        verify(veiculoRepository).listarVendidosOrdenadoPorPreco();
    }
}
