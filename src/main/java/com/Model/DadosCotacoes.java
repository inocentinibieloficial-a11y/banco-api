package com.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosCotacoes {

    @JsonAlias("bid")
    private Double compra;

    @JsonAlias("ask")
    private Double venda;

    @JsonAlias("high")
    private Double alta;

    @JsonAlias("low")
    private Double baixa;

    @JsonAlias("name")
    private String nome;

    @JsonAlias("create_date")
    private String dataAtualizacao;

    public DadosCotacoes() {
    }

    public Double getCompra() {
        return compra;
    }

    public void setCompra(Double compra) {
        this.compra = compra;
    }

    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    public Double getAlta() {
        return alta;
    }

    public void setAlta(Double alta) {
        this.alta = alta;
    }

    public Double getBaixa() {
        return baixa;
    }

    public void setBaixa(Double baixa) {
        this.baixa = baixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return String.format(
                "%s%nCompra: R$ %.4f%nVenda:  R$ %.4f%nAlta:   R$ %.4f%nBaixa: R$ %.4f%nAtualizado: %s",
                nome, compra, venda, alta, baixa, dataAtualizacao
        );
    }
}