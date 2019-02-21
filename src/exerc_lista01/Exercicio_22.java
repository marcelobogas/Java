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
public class Exercicio_22 {

    public Exercicio_22() {
        //Código do construtor
    }

    public void Executar_Programa_22() {

        int num4 = 0,
                soma4 = 0;

        //Recebe o número digitado
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        //Laço para percorrer a sequência
        for (int i = num4 + 1; i < num4 + 100; i++) {
            soma4 += i;
        }

        //Mostra a soma dos números da seqência
        System.out.println("Total: " + soma4);

        System.out.println("\n");

    }

}
