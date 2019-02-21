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
public class Exercicio_29 {

    public Exercicio_29() {
        //Código do construtor
    }

    public void Executar_Programa_29() {

        int opcao = 0;
        String escolha = new String();

        //Laço para rodar o programa
        do {

            //Menu de opções para o usuário
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu de opções:\n"
                    + "[0] Tabuada Dinêmica\n [1] Par ou Ímpar\n "
                    + "[2] Notas\n [3] Sair \nDigite uma opção"));

            switch (opcao) {

                case 0:

                    int num = 0;

                    //Armazena o número digitado pelo usuário
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

                    //Laçoa para realizar a tabuada
                    for (int i = 0; i < 11; i++) {
                        System.out.println(num + " * " + i + ": " + (num * i));
                    }

                    break;

                case 1:

                    int num1 = 0;
                    String str = new String();

                    //Armazena o número digitado pelo usuário
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

                    //Verifica se o número é Par ou Ímpar
                    if (num1 % 2 == 0)
                        str = "Par";
                    else
                        str = "Ímpar";
                    
                    System.out.println("O Nro digitado é: " + str);

                    break;

                case 2:

                    break;

                case 3:

                    System.out.println("Programa finalizado com sucesso!!");
                    System.out.println("\n");

                    break;

                default:
                    System.out.println("Opção inválida!!");
            }

            escolha = JOptionPane.showInputDialog("Deseja continuar: ");

        } while (escolha == "s");

        System.out.println("\n");
    }

}
