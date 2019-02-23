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
        int idade,
                idadeMenor = 0,
                idadeMaior = 0,
                idadeMedia = 0,
                //opcao = 0,
                cont = 0;
        String opcao = new String();

        do {

            //Armazena o nome e a idade
            nome = JOptionPane.showInputDialog("Informe o Nome: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade: "));

            //Condição para iniciar a comparação
            if ((idadeMenor == 0) && (idadeMaior == 0)) {

                //Preenche as duas variáveis para iniciar a comparação entre elas
                idadeMenor = idadeMaior = idade;
                idadeMedia += idade;
                cont++;

            } else {

                if (idade < idadeMenor) {

                    idadeMenor = idade;
                    idadeMedia += idade;
                    cont++;

                } else if (idade > idadeMaior) {

                    idadeMaior = idade;
                    idadeMedia += idade;
                    cont++;

                }
            }

            //Mostra as informações digitadas
            System.out.println("Nome: " + nome + "\tIdade: " + idade + " anos");
            
            opcao = JOptionPane.showInputDialog("Boa tarde");

            //Sair do programa
            if (opcao.equals("n") || opcao.equals("N")) {

                System.out.println("\nIdade menor: " + idadeMenor + "\t\tIdade maior: "
                        + idadeMaior + "\t\tIdade média: " + idadeMedia / cont);
                System.out.println("\nFinalizado com sucesso!!!");

            }

        } while (opcao.equals("s") || opcao.equals("S"));
    }

}
