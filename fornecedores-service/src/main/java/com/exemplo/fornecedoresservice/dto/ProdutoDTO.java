package com.exemplo.fornecedoresservice.dto;

import java.math.BigDecimal;

/**
 * Produto como ele chega do produtos-service. So' os campos que usamos aqui,
 * sem ser entidade: este servico nao guarda produtos no proprio banco.
 */
public class ProdutoDTO {

    private Long id;
    private String nome;
    private BigDecimal preco;

    public ProdutoDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
