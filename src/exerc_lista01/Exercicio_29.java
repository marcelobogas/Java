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

    public static void Executar_Programa_29() {

        int opcao = 0;
        String escolha = new String();
        String mensagem = "Deseja contunuar: ";

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
                    if (num1 % 2 == 0) {
                        str = "Par";
                    } else {
                        str = "Ímpar";
                    }

                    System.out.println("O Nro digitado é: " + str);

                    break;

                case 2:

                    float vet[] = new float[4],
                     soma = 0,
                     menor = 0,
                     maior = 0;
                    int cont = 0;

                    for (int i = 1; i < 5; i++) {

                        vet[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a " + i + "ª nota: "));
                        System.out.println("[" + i + "ª]" + " nota: " + vet[i]);
                        soma += vet[i];

                        if (menor == 0 && maior == 0) {
                            menor = maior = vet[i];
                            cont++;
                        } else {

                            if (vet[i] < menor) {
                                menor = vet[i];
                                cont++;
                            }

                            if (vet[i] > maior) {
                                maior = vet[i];
                                cont++;
                            }

                        }

                    }

                    System.out.println("Soma das notas: " + soma + "\tMédia das notas: " + soma / cont
                            + "Menor nota: " + menor + "Maior nota: " + maior);

                    break;

                case 3:

                    System.out.println("Finalizado com sucesso!!!\n");
                    System.exit(0);

                    break;

                default:
                    System.out.println("Opção inválida!!");
            }

            //Opção para continuar ou sair do programa
            escolha = JOptionPane.showInputDialog(mensagem);

            if (escolha.equals("n") || escolha.equals("N")) {

                System.exit(0);

            }

        } while (escolha.equals("s") || escolha.equals("S"));

        System.out.println("\n");
    }

}
