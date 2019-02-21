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
public class Exercicio_10 {

    public Exercicio_10() {
        //Código do construtor
    }

    public void Executar_Programa_10() {

        int vetTemp[] = new int[30],
                cont1 = 0;

        //Variáveis de temperatura
        float mediaTemp = 0;
        int maiorTemp = vetTemp[0];
        int menorTemp = vetTemp[0];

        //Laço para preencher o vetor
        for (int i = 0; i < 3; i++) {
            vetTemp[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma temperatura: "));
            System.out.println("Nro digitado: " + vetTemp[i]);

            //Preenche as dus posições na primeira passagem do laço
            if (vetTemp[i] == vetTemp[0]) {
                menorTemp = maiorTemp = vetTemp[i];
            } else {
                //Comparação de temperaturas
                if (vetTemp[i] > maiorTemp) {
                    maiorTemp = vetTemp[i];
                }
                if (vetTemp[i] < menorTemp) {
                    menorTemp = vetTemp[i];
                }
            }

            mediaTemp += vetTemp[i];
            cont1++;
        }

        //Mostrar resultado final
        System.out.println("\nMaior Temperatura: " + maiorTemp + "\tMenor Temperatura: " + menorTemp
                + "\tTemperatura Média: " + mediaTemp / cont1);

        System.out.println("\n");

    }

}
