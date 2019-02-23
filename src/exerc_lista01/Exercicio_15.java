/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc_lista01;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Exercicio_15 {

    public Exercicio_15() {
        //Código do construtor
    }

    public void Executar_Programa_15() {

        int vetor1[] = new int[10],
                maior = 0;

        // Laço para preencher o vetor
        for (int i = 0; i < 10; i++) {
            vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

            //Comparação entre os números digitados
            if (vetor1[i] > maior) {
                maior = vetor1[i];
            }
        }

        //Laço para mostrar os números digitados
        for (int i = 0; i < 10; i++) {
            System.out.printf("[%dº] número: %d \n", i + 1, vetor1[i]);
        }

        //Maior número Digitado
        System.out.printf("Maior número: %d", maior);

        System.out.println("\n");

    }

}
