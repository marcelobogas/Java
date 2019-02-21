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
public class Exercicio_27 {

    public Exercicio_27() {
        //Código do construtor
    }

    public void Executar_Programa_27() {

        String sexo = new String();
        int idade1 = 0,
                mediaIdade = 0,
                fem = 0,
                mas = 0;
        String opcao2 = new String();

        do {

            //Armazena a opção informada pelo usuário
            sexo = JOptionPane.showInputDialog("Use [F] para sexo feminino \n"
                    + "Use [M] para sexo masculino \n\nQual o seu sexo: ");
            idade1 = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade: "));

            if (sexo == "f" || sexo == "F") {

                fem++;
                mediaIdade += idade1;
                opcao2 = JOptionPane.showInputDialog("Deseja continuar?");
            }

            if (sexo == "m" || sexo == "M") {

                mas++;
                mediaIdade += idade1;

            }

            //cálcula á idade média
            mediaIdade = fem + mas;

            //Opção para o usuário continuar ou sair do programa
            opcao2 = JOptionPane.showInputDialog("Deseja continuar: ");

        } while (opcao2 == "s" || opcao2 == "S");

        System.out.println("Total feminino: " + fem + "\tTotal masculino: " + mas
                + "\tMédia de idade: " + mediaIdade);

        System.out.println("\n");

    }

}
