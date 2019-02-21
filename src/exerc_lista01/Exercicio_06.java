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
public class Exercicio_06 {

    public Exercicio_06() {
        //Código do construtor
    }

    public void Executar_Programa_06() {

        float cont = 1,
                soma = 0;

        //Laço para realizar o cálculo da expressão
        for (int i = 1; i < 100; i += 2) {
            soma += (i / cont);
            cont++;
        }

        System.out.println("Total: " + soma);
        System.out.println("\n");

    }

}

