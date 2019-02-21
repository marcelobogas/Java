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

        do {

            saldoInicial = Float.parseFloat("Informe o seu saldo inicial: ");

            if (saldoInicial < 0) {

                //Não permite que o saldo inicial seja negativo
                System.out.println("Saldo inicial não pode ser negativo!!!");

            }

            //Menu de opções com as operações para movimentar a conta
            opcao = JOptionPane.showInputDialog("Menu de opções: \n\n"
                    + "[A] SALDO \n"
                    + "[B] SAQUE"
                    + "[C] DEPÓSITO"
                    + "[D] SAIR");

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
                    saque = Float.parseFloat("Informe o valor para saque: \n\n");

                    //Não permite o saque ser negativo 
                    if (saque < 0) {
                        System.out.println("Saque não pode ser Negativo");
                    }

                    //decrementa o valor da conta
                    saldo -= saque;

                    System.out.println("Saldo atual: " + saldo);

                    break;

                case "c":
                case "C":

                    //Informa o valor do depósito
                    deposito = Float.parseFloat("Informe o valor para saque: \n\n");

                    //Não permite o depósito ser negativo 
                    if (deposito < 0) {
                        System.out.println("Informe um valor positivo para depósito!!!");
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

        } while (opcao != "");

        System.out.println("\n");

    }

}
