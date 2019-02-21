package Exercicios;

import java.util.Scanner;

public class Exercicio6_Secao4 {

	public static void main(String[] args) {
		System.out.println("*** Jogo da Advinha��o ***");
		System.out.println("Vo�� tem 10 tentativas para acertar o n�mero correto entre 0 � 100");

		Scanner scanner = new Scanner(System.in);
		float numeroArmazenado = 77;
		int contadorDeTentativas = 9;

		while (contadorDeTentativas >= 0) {
			System.out.printf("\nInforme um n�mero: ");
			float numeroDigitado = scanner.nextFloat();

			if (numeroDigitado == numeroArmazenado) {
				System.out.println("Parab�ns n�mero correto!!!");
				System.out.println("Final do jogo!!!");
			} else {
				if (numeroDigitado > numeroArmazenado)
					System.out.println("N�mero informado maior do que o correto.");
				if (numeroDigitado < numeroArmazenado)
					System.out.println("N�mero informado menor do que o correto.");
				System.out.println("Voc� ainda tem " + contadorDeTentativas + " tentativas.");
			}
			contadorDeTentativas--;
		}
		scanner.close();
		System.out.println("Final do jogo!!!");
	}
}
