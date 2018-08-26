package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio4_Secao3 {

	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Digite um número:");
		float num1 = Float.parseFloat(resposta1);
		float resultado1 = num1 * num1;
		System.out.printf("O número " + resposta1 + " elavado ao quadrado é: %.1f \n", resultado1);
		
		String resposta2 = JOptionPane.showInputDialog("Digite outro número:");
		float num2 = Float.parseFloat(resposta2);
		float resultado2 = num2 * num2 * num2;
		System.out.printf("O número " + resposta2 + " elavado ao cubo é: %.1f \n", resultado2);
	}
}