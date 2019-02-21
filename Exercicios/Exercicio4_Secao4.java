package Exercicios;

import java.util.Scanner;

public class Exercicio4_Secao4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float num = scanner.nextFloat();
		int contador = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) contador++;
		}
		
		if (contador == 2) {
			System.out.println("O número digitado é primo");
		}else {
			System.out.println("O número digitado não é primo");
		}
		scanner.close();
	}
}
