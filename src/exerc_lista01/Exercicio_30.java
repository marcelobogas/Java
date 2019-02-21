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
public class Exercicio_30 {

    public Exercicio_30() {
        //Código do construtor
    }

    public void Executar_Programa_30() {

        int F = 0;   //Atual
        int ANT = 0; //Anterior

        for (int i = 0; i < 20; i++) {

            //realiza o padrão da sequência
            if (i == 1) {
                F = 1;
                ANT = 0;
            } else {
                F += ANT;
                ANT = F - ANT;
            }

            //Mostra a sequência
            System.out.println("Nro: " + F);
        }

        System.out.println("\n");

    }

}
