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
public class Exercicio_16 {

    public Exercicio_16() {
        //Código do construtor
    }

    public void Executar_Programa_16() {

        float media = 0;
        int soma3 = 0,
                cont2 = 0;
        Random r1 = new Random();

        //Laço  para preencher o vetor
        for (int i = 0; i < 20; i++) {
            //preenche o vetor com números aleatórios
            soma3 += r1.nextInt(101);
            cont2++;

            //Mostra o número preenchido
            System.out.println("Nro: " + soma3);

            //Soma os números no vetor
            media += soma3;
        }

        //Mostra o resultado
        System.out.println("\nMédia: " + media / cont2);

        System.out.println("\n");

    }

}
