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
public class Exercicio_17 {

    public Exercicio_17() {
        //Código do construtor
    }

    public void Executar_Programa_17() {

        int num2,
                num3,
                exp = 2;
        double soma8 = 0;

        //Armazena o número digitado pelo usuário
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro nº: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo nº: "));

        //Mostra os números digirtados
        System.out.println("1º Nro: " + num2 + "\t\t2ºNro: " + num3);

        if (num2 < num3) {
            //
            for (int i = num2 + 1; i < num3; i++) {
                soma8 = soma8 + Math.pow(i, exp);
            }
            System.out.println("Total: " + soma8);
        } else {
            for (int i = num2 - 1; i > num3; i--) {
                soma8 = soma8 + Math.pow(i, exp);
            }
            System.out.println("Total: " + soma8);
        }

        System.out.println("\n");

    }

}
