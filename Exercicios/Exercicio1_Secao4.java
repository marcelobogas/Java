package Exercicios;

import java.util.Scanner;

public class Exercicio1_Secao4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();		
		
		if (num >= 0 && num <= 10) {
				if (num % 2 == 0) {
					System.out.println("O n�mero digitado � par!");
				}
				else {
					System.out.println("O n�mero digitado � �mpar!");
				}
		}else {
			System.out.println("O n�mero informado n�o est� entre 0 e 10");
		}
		scanner.close();
	}
}
