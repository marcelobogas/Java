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
public class Exercicio_08 {

    public Exercicio_08() {
        //Código do construtor
    }

    public void Executar_Programa_08() {

        float soma2 = 0;
        int cont1 = 0,
                numGerado = 0;

        //Laço para realizar a média da sequência de 10 números aleatórios
        for (int i = 0; i < 10; i++) {
            // método para gerar números aleatórios
            numGerado = (int) (Math.random() * 101);
            System.out.println("Nro: " + numGerado);
            soma2 += numGerado;
            cont1++;
        }

        System.out.println("\nTotal: " + soma2 / cont1);

        System.out.println("\n");

    }

}