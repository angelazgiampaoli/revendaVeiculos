package com.revendaveiculos.api.application;


import com.revendaveiculos.api.domain.model.Veiculo;
import com.revendaveiculos.api.domain.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CadastroVeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;
     
   
    
    public Veiculo cadastrar(Veiculo veiculo) {
        return veiculoRepository.salvar(veiculo);
    }

    public Veiculo buscarPorId(Long id) {
    return veiculoRepository.buscarPorId(id).orElse(null);
}


    
    public Veiculo editar(Long id, Veiculo dadosAtualizados) {
        Veiculo veiculo = veiculoRepository.buscarPorId(id)
            .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        veiculo.setMarca(dadosAtualizados.getMarca());
        veiculo.setModelo(dadosAtualizados.getModelo());
        veiculo.setAno(dadosAtualizados.getAno());
        veiculo.setCor(dadosAtualizados.getCor());
        veiculo.setPreco(dadosAtualizados.getPreco());

        return veiculoRepository.salvar(veiculo);
    }
}
