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
public class Exercicio_23 {

    public Exercicio_23() {
        //Código do construtor
    }

    public void Executar_Programa_23() {

        int soma5 = 0;

        //Laço para percorrer a sequência
        for (int i = 100; i < 201; i++) {
            if ((i % 2) == 0) {
                soma5 += i;
            }
        }

        //Resultado da Soma
        System.out.println("Total: " + soma5);

        System.out.println("\n");

    }

}
