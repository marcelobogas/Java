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
        String mensagem = "Deseja continuar: ";
        int fem = 0,
                mas = 0,
                cont = 0,
                mediaIdade = 0,
                idade = 0;
        String opcao = new String();

        do {

            //Armazena a opção informada pelo usuário
            sexo = JOptionPane.showInputDialog("Use [F] para sexo feminino \n"
                    + "Use [M] para sexo masculino \n\nQual o seu sexo: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade: "));

            if (sexo.equals("f") || sexo.equals("F")) {

                mediaIdade += idade;
                fem++;
                cont++;

            } else if (sexo.equals("m") || sexo.equals("M")) {

                mediaIdade += idade;
                mas++;
                cont++;

            } else {

                System.out.println("Opção inválida!!!");

            }

            //cálcula á idade média
            mediaIdade = fem + mas;

            //Opção para o usuário continuar ou sair do programa
            opcao = JOptionPane.showInputDialog(mensagem);

            if (opcao.equals("n") || opcao.equals("N")) {

                System.out.println("Total feminino: " + fem + "\tTotal masculino: " + mas
                        + "\tMédia de idade: " + mediaIdade / cont);
                System.out.println("\nFinalizado com sucesso!!!");

            }

        } while (opcao.equals("s") || opcao.equals("S"));
    }

}
