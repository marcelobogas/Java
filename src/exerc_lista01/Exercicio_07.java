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
public class Exercicio_07 {

    public Exercicio_07() {
        //Código do construtor
    }

    public void Executar_Programa_07() {

        int x,
                y,
                soma1 = 0;

        x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));

        //Laço para mostrar a soma dos números pares
        for (int i = x; i <= y; i++) {
            if ((i % 2) == 0) {
                soma1 += i;
            }
        }

        System.out.println("Total: " + soma1);

        System.out.println("\n");

    }

}