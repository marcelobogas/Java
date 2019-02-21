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
public class Exercicio_03 {

    public Exercicio_03() {
        //Código do construtor
    }

    public void Executar_Programa_03() {

        //Laço para mostrar números ímpares na ordem decrescente
        for (int i = 700; i > 499; i--) {
            if ((i % 2) != 0) {
                System.out.println("Nro: " + i);
            }
        }
        System.out.println("\n");

    }

}