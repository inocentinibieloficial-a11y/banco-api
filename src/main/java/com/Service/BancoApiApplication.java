package com.Service;

import com.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BancoApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BancoApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		Scanner scanner = new Scanner(System.in);
		String continuar = "s";

		while (continuar.equalsIgnoreCase("s")) {
			principal.exibirMenu();
			System.out.print("\nConsultar outra moeda? (s/n): ");
			continuar = scanner.nextLine().trim();
		}

		System.out.println("Encerrando o conversor!");
	}
}