package com.Service;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

<<<<<<< HEAD
import java.time.LocalDate;

=======
>>>>>>> 7c91075a7b7230583fe61cfc8eb58a45c9781d62
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCotacao(
        @JsonAlias("compra") Double compra,
        @JsonAlias("venda") Double venda,
        @JsonAlias("fechoAnterior") Double fechoAnterior,
        @JsonAlias("nome") String nome,
        @JsonAlias("moeda") String moeda,
<<<<<<< HEAD
        @JsonAlias("dataAtualizacao") LocalDate dataAtualizacao
=======
        @JsonAlias("dataAtualizacao") String dataAtualizacao
>>>>>>> 7c91075a7b7230583fe61cfc8eb58a45c9781d62
) {}
