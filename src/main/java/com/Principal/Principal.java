package com.Principal;

import com.Model.DadosCotacoes;
import com.Service.ConsumoAPI;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();

    public void exibirMenu() {

        int opcao;

        do {

            System.out.println("\n╔═════════════════════════════╗");
            System.out.println("║   CONVERSOR DE MOEDAS 💰    ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║ 1 - Converter moeda         ║");
            System.out.println("║ 0 - Sair                    ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(leitura.nextLine());

            switch (opcao) {

                case 1 -> converter();

                case 0 -> System.out.println("Encerrando sistema...");

                default -> System.out.println("Opção inválida!");

            }

        } while (opcao != 0);
    }

    private void converter() {

        try {

            System.out.println("\nMoedas disponíveis:");
            System.out.println("USD = Dólar");
            System.out.println("EUR = Euro");
            System.out.println("ARS = Peso Argentino");
            System.out.println("CLP = Peso Chileno");
            System.out.println("UYU = Peso Uruguaio");

            System.out.print("\nDigite a sigla: ");
            String sigla = leitura.nextLine().trim().toUpperCase();

            if (!sigla.matches("[A-Z]{3}")) {
                System.out.println("Sigla inválida.");
                return;
            }

            String url =
                    "https://economia.awesomeapi.com.br/json/last/"
                            + sigla + "-BRL";

            String json = consumo.obterDados(url);

            if (json == null || json.isBlank()) {
                System.out.println("Erro ao consultar API.");
                return;
            }

            ObjectMapper mapper = new ObjectMapper();

            JsonNode raiz = mapper.readTree(json);

            JsonNode moeda = raiz.get(sigla + "BRL");

            if (moeda == null) {
                System.out.println("Moeda não encontrada.");
                return;
            }

            DadosCotacoes cotacao =
                    mapper.treeToValue(moeda, DadosCotacoes.class);

            System.out.println("\n=== COTAÇÃO ATUAL ===");
            System.out.println(cotacao);

            System.out.print("\nDigite valor em reais: R$ ");

            double reais = Double.parseDouble(
                    leitura.nextLine().replace(",", ".")
            );

            double convertido = reais / cotacao.getCompra();

            System.out.println("\n=== RESULTADO ===");
            System.out.printf("R$ %.2f = %.4f %s%n",
                    reais, convertido, sigla);

        } catch (Exception e) {
            System.out.println("Erro na conversão.");
        }
    }
}