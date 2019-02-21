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
public class Exercicio_25 {

    public Exercicio_25() {
        //Código do construtor
    }

    public void Executar_Programa_25() {

        int vetor[] = new int[15];
        int soma = 0,
                maior = vetor[0],
                cont = 0;
        float media = 0;

        //Laço para preencher o vetor e realizar os cálculos
        for (int i = 0; i < 5; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            soma += vetor[i];
            media = soma;
            cont++;

            //Comparação entre os números digitados
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        //Resultados
        System.out.println("Soma: " + soma + "\tMédia: " + media / cont + "\tMaior: " + maior);

        System.out.println("\n");

    }

}
