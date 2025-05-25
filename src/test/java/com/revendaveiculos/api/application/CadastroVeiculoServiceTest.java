package com.revendaveiculos.api.application;

import com.revendaveiculos.api.domain.model.Veiculo;
import com.revendaveiculos.api.domain.repository.VeiculoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CadastroVeiculoServiceTest {

    @Mock
    private VeiculoRepository veiculoRepository;

    @InjectMocks
    private CadastroVeiculoService cadastroVeiculoService;

    private AutoCloseable closeable;

    @BeforeEach
    void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void deveCadastrarVeiculoComSucesso() {
        Veiculo veiculo = new Veiculo(); // configure com setters se necessário
        when(veiculoRepository.salvar(veiculo)).thenReturn(veiculo);

        Veiculo resultado = cadastroVeiculoService.cadastrar(veiculo);

        assertNotNull(resultado);
        verify(veiculoRepository).salvar(veiculo);
    }

    @Test
    void deveEditarVeiculoComSucesso() {
        Long id = 1L;
        Veiculo existente = new Veiculo();
        existente.setId(id);

        Veiculo atualizado = new Veiculo();
        atualizado.setMarca("Toyota");
        atualizado.setModelo("Corolla");
        atualizado.setAno(2022);
        atualizado.setCor("Preto");
        atualizado.setPreco(new BigDecimal("90000.00"));

        when(veiculoRepository.buscarPorId(id)).thenReturn(Optional.of(existente));
        when(veiculoRepository.salvar(existente)).thenReturn(existente);

        Veiculo resultado = cadastroVeiculoService.editar(id, atualizado);

        assertEquals("Toyota", resultado.getMarca());
        verify(veiculoRepository).salvar(existente);
    }

    @Test
    void deveLancarExcecaoQuandoEditarVeiculoInexistente() {
        Long id = 99L;
        when(veiculoRepository.buscarPorId(id)).thenReturn(Optional.empty());

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            cadastroVeiculoService.editar(id, new Veiculo());
        });

        assertEquals("Veículo não encontrado", exception.getMessage());
    }
}
