package Exercicios;

import java.util.Scanner;

public class Exercicio6_Secao4 {

	public static void main(String[] args) {
		System.out.println("*** Jogo da Advinhação ***");
		System.out.println("Voçê tem 10 tentativas para acertar o número correto entre 0 à 100");

		Scanner scanner = new Scanner(System.in);
		float numeroArmazenado = 77;
		int contadorDeTentativas = 9;

		while (contadorDeTentativas >= 0) {
			System.out.printf("\nInforme um número: ");
			float numeroDigitado = scanner.nextFloat();

			if (numeroDigitado == numeroArmazenado) {
				System.out.println("Parabéns número correto!!!");
				System.out.println("Final do jogo!!!");
			} else {
				if (numeroDigitado > numeroArmazenado)
					System.out.println("Número informado maior do que o correto.");
				if (numeroDigitado < numeroArmazenado)
					System.out.println("Número informado menor do que o correto.");
				System.out.println("Você ainda tem " + contadorDeTentativas + " tentativas.");
			}
			contadorDeTentativas--;
		}
		scanner.close();
		System.out.println("Final do jogo!!!");
	}
}
