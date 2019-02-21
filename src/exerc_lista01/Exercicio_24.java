/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc_lista01;

/**
 *
 * @author Administrador
 */
public class Exercicio_24 {

    public Exercicio_24() {
        //Código do construtor
    }

    public void Executar_Programa_24() {

        int soma6 = 0;

        //Laço para percorrer a sequência
        for (int i = 0; i < 100; i++) {
            if ((i % 2) != 0) {
                soma6 += i;
            }
        }

        //Resultado da Soma
        System.out.println("Total: " + soma6);

        System.out.println("\n");

    }

}
