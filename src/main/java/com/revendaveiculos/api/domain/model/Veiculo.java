package com.revendaveiculos.api.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;


@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private Integer ano;
    private String cor;
    private BigDecimal preco;
    private boolean vendido = false;
    public Long getId() {
        return id;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Integer getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public boolean isVendido() {
        return vendido;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    public Veiculo(Long id, String marca, String modelo, Integer ano, String cor, BigDecimal preco, boolean vendido) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.vendido = vendido;
    }
    public Veiculo() {
    }

    
}

