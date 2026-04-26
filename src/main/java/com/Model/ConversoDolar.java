package Spring.web.sem.web.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ConversoDolar(
        @JsonAlias("nome")          String nome,
        @JsonAlias("moeda")         String moeda,
        @JsonAlias("compra")        Double compra,
        @JsonAlias("venda")         Double venda,
        @JsonAlias("fechoAnterior") Double fechoAnterior,
        @JsonAlias("dataAtualizacao") LocalDateTime dataAtualizacao
) {}