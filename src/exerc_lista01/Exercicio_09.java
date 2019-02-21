/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc_lista01;

import java.util.Random;

/**
 *
 * @author Administrador
 */
public class Exercicio_09 {

    public Exercicio_09() {
        //Código do construtor
    }

    public void Executar_Programa_09() {

        int vetor[] = new int[20];

        // método para gerar números aleatórios
        Random r = new Random();

        int maior = 0;
        for (int i = 0; i < 20; i++) {
            // preenche o vetor com os números aleatórios
            vetor[i] = r.nextInt(101);

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        //Laço para mostrar a saída do vetor
        for (int i = 0; i < 20; i++) {
            System.out.println("Nro: " + vetor[i]);
        }

        // Maior número do vetor
        System.out.println("Maior número: " + maior);

        System.out.println("\n");

    }

}