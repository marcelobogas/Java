package Exercicios;

import java.util.Scanner;

public class Exercicio2_Secao4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ano = scanner.nextInt();		
		
		if (ano % 400 == 0) {
			System.out.println(ano + " � ano Bissexto!");
		}
		
		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println(ano + " � ano bissexto!");
		}else {
			System.out.println(ano + " n�o � ano bissexto!");
		}
		
		scanner.close();
	}
}
