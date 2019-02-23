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
public class Exercicio_28 {

    public Exercicio_28() {
        //Código do construtor
    }

    public void Executar_Programa_28() {

        float saldoInicial = 0,
                saque = 0,
                deposito = 0,
                saldo = 0;
        String opcao = new String();
        String mensagem = "Deseja continuar: ";

        if (saldoInicial == 0) {

            saldoInicial = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu saldo inicial: "));

            if (saldoInicial < 0) {

                //Não permite que o saldo inicial seja negativo
                System.out.println("Saldo inicial não pode ser negativo!!!");

            } else {

                do {

                    //Menu de opções com as operações para movimentar a conta
                    opcao = JOptionPane.showInputDialog("Menu de opções: \n\n"
                            + "[A] SALDO \n"
                            + "[B] SAQUE \n"
                            + "[C] DEPÓSITO \n"
                            + "[D] SAIR \n");

                    switch (opcao) {

                        case "a":
                        case "A":

                            //calcula o saldo da conta
                            saldo = saldoInicial + deposito - saque;
                            System.out.println("Saldo atual: " + saldo);

                            break;

                        case "b":
                        case "B":

                            //Informa o valor do saque
                            saque = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor para saque: \n"));

                            //Não permite o saque ser negativo 
                            if (saque < 0) {
                                System.out.println("Valor não pode ser Negativo!!!");
                            }

                            //decrementa o valor da conta
                            saldo -= saque;

                            System.out.println("Saldo atual: " + saldo);

                            break;

                        case "c":
                        case "C":

                            //Informa o valor do depósito
                            deposito = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor para depósito: \n"));

                            //Não permite o depósito ser negativo 
                            if (deposito < 0) {
                                System.out.println("Valor não pode ser Negativo!!!");
                            }

                            //decrementa o valor da conta
                            saldo += deposito;

                            System.out.println("Saldo atual: " + saldo);

                            break;

                        case "d":
                        case "D":

                            System.exit(0);

                            break;

                        default:

                            System.out.println("Opção inválida!!!");

                            break;

                    }

                    //Opção para o usuário continuar com operações ou não
                    opcao = JOptionPane.showInputDialog(mensagem);
                    
                    //Condição para encerrar a operação
                    if (opcao.equals("d") || opcao.equals("D")) {

                        System.exit(0);

                    }

                } while (opcao.equals("s") || opcao.equals("S"));
            }

        }

        System.out.println("\n");
    }

}
