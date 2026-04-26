package com.Principal;

import com.Service.ConsumoAPI;
import com.Service.ConverteDados;

import java.util.Scanner;

public class Principal {

        private Scanner leitura = new Scanner(System.in);
        private ConsumoAPI consumo = new ConsumoAPI();
        private ConverteDados conversor = new ConverteDados();

        private final String ENDERECO = "curl https://br.dolarapi.com/v1/cotacoes/usd";


        public void exibirMenu() {
            System.out.println("\n=== CONVERSOR DE MOEDAS ===");
            System.out.println("Digite a moeda que deseja converter:");
            System.out.println("USD = Dólar | EUR = Euro | ARS = Peso Argentino");
            System.out.println("CLP = Peso Chileno | UYU = Peso Uruguaio");
            System.out.print("Digite a apreviacoe da Moeda : ");

            var nomeNota = leitura.nextLine().toUpperCase();
            if (nomeNota.length() == 3) {
                System.out.println("certo");
                return;
            }else{
                System.out.println("Erro o nome foi digitado errado !!");
            }

//            var consumoapi = new ConsumoAPI();
//            var json = consumo.obterDados( ENDERECO + nomeNota);
//            DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
//            System.out.println(dados);



        }
}
