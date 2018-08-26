package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio5_Secao3 {

	public static void main(String[] args) {
		String base = JOptionPane.showInputDialog("Informe o valor da base do triângulo:");
		String altura = JOptionPane.showInputDialog("Informe o valor da altura do triângulo:");
		float area = (Float.parseFloat(base) * Float.parseFloat(altura)) / 2;
		System.out.println("A área do triângulo é: " + area);
	}
}
