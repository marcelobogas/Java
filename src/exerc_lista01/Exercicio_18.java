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
public class Exercicio_18 {

    public Exercicio_18() {
        //Código do construtor
    }

    public void Executar_Programa_18() {

        float s = 0;
        int div = 1; //Gera os divisores da fração

        //Realiza o cálculo
        for (int i = 37; i > 0; i--) {
            //Cálcula a expressão
            s = (i * (i + 1)) / div;
            System.out.println("Soma: " + s);
            div++;
        }

        //Apresenta o resultado
        System.out.println("S: " + s);

        System.out.println("\n");

    }

}
