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
public class Exercicio_26 {

    public Exercicio_26() {
        //Código do construtor
    }

    public void Executar_Programa_26() {

        String nome = new String();
        String opcao1 = new String();
        int idade = 0,
                idadeMenor = 0,
                idadeMaior = 0,
                idadeMedia = 0,
                cont5 = 0;
        opcao1 = "s";

        switch (opcao1) {

            case "N":
            case "n":

                System.out.println("Idade menor: " + idadeMenor + "\t\tIdade maior: " + idadeMaior
                        + "Média de Idade: " + idadeMedia / cont5);

                break;

            case "S":
            case "s":

                //Armazena o nome e a idade
                nome = JOptionPane.showInputDialog("Informe o Nome: ");
                idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade: "));

                //Mostra as informações digitadas
                System.out.println("Nome: " + nome + "\tIdade: " + idade + " anos");

                //Condição para iniciar a comparação
                if ((idadeMenor == 0) && (idadeMaior == 0)) {

                    //Preenche as duas variáveis para iniciar a comparação entre elas
                    idadeMenor = idadeMaior = idade;
                    idadeMedia += idade;

                } else {

                    if (idade < idadeMenor) {

                        idadeMenor = idade;
                        idadeMedia += idade;

                    }

                    if (idade > idadeMaior) {

                        idadeMaior = idade;
                        idadeMedia += idade;

                    }
                }
                break;

            default:

                System.out.println("Opção inválida!!\n"
                        + "Use S para continuar ou N para sair do programa");
                break;
        }

        //Opção para o usuário continuar ou sair do programa
        opcao1 = JOptionPane.showInputDialog("Deseja continuar: ");

        System.out.println("\n");

    }

}
