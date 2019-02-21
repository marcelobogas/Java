package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio3_Secao4 {

	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota:");
		String nota2 = JOptionPane.showInputDialog("Informe a seginda nota:");
		
		float num1 = Float.parseFloat(nota1);
		float num2 = Float.parseFloat(nota2);
		float media = (num1 + num2) / 2;
		
		if (media >= 7) System.out.println("Aprovado");
		else if (media > 4) System.out.println("Recuperação");
		else System.out.println("Reprovado");
	}
}
