package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Qual a primeira nota?");
		String resposta2 = JOptionPane.showInputDialog("Qual a segunda nota?");
		
		System.out.println(resposta1 + resposta2);
		
		// converter string em double
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double total = nota1 + nota2;
		
		System.out.println(total / 2);
	}
}
