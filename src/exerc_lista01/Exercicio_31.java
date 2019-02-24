package exerc_lista01;

import javax.swing.JOptionPane;

public class Exercicio_31 {

    public Exercicio_31() {
        //Código do construtor
    }

    public static void Executar_Programa_31() {

        //Exercicio de fatoração usando laço de repetição
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: ")),
                result = num;
        
        System.out.println("O fatorial de " + num + " é: " + num);

        //Laço para realizar a fatoração
        for (int i = num; i > 1; i--) {

            System.out.println("\t\t x " + (i - 1));
            result *= i - 1;
            
        }
        
        System.out.println("Resultado da fatoração é: " + result + "\n");
        System.exit(0);

    }

}
