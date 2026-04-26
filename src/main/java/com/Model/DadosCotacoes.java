package com.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosCotacoes {

    @JsonAlias("compra")
    private Double compra;

    @JsonAlias("venda")
    private Double venda;

    @JsonAlias("fechoAnterior")
    private Double fechamentoAnterior;

    @JsonAlias("nome")
    private String nome;

    @JsonAlias("dataAtualizacao")
    private LocalDateTime dataAtualizacao;

    // Construtor vazio — OBRIGATÓRIO para o Jackson funcionar
    public DadosCotacoes() {}

    // Seu construtor original
    public DadosCotacoes(Double compra, String nome,
                         LocalDateTime dataAtualizacao, Double venda) {
        this.compra = compra;
        this.nome = nome;
        this.dataAtualizacao = dataAtualizacao;
        this.venda = venda;
    }

    // ... todos os getters e setters que você já tem ...

    @Override
    public String toString() {
        return String.format(
                "%-20s | Compra: R$ %.4f | Venda: R$ %.4f",
                nome, compra, venda
        );
    }
}