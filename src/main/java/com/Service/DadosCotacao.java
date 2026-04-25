package com.Service;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCotacao(
        @JsonAlias("compra") Double compra,
        @JsonAlias("venda") Double venda,
        @JsonAlias("fechoAnterior") Double fechoAnterior,
        @JsonAlias("nome") String nome,
        @JsonAlias("moeda") String moeda,
        @JsonAlias("dataAtualizacao") String dataAtualizacao
) {}
