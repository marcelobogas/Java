package exerc_lista01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
 */
public class Exercicio_19 {

    public Exercicio_19() {
        //Código do construtor
    }

    public void Executar_Programa_19() {

        int f = 0;   //Atual
        int ant = 0; //Anterior

        for (int i = 0; i < 15; i++) {

            //realiza o padrão da sequência
            if (i == 1) {
                f = 1;
                ant = 0;
            } else {
                f += ant;
                ant = f - ant;
            }

            //Mostra a sequência
            System.out.println("Nro: " + f);
        }

        System.out.println("\n");

    }

}
