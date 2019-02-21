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
public class Exercicio_13 {

    public Exercicio_13() {
        //Código do construtor
    }

    public void Executar_Programa_13() {

        int num1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        //Número dígitado no teclado
        System.out.println("Nro Digitado: " + num1);

        for (int num = (num1 + 1); num < (num1 + 1) + 10; num++) {
            System.out.println("Próximo número: " + num);
        }

        System.out.println("\n");

    }

}
