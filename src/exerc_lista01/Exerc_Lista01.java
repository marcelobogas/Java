package exerc_lista01;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Administrador
 */
public class Exerc_Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcao = 0;

        do {
            //Menu com todos os CASE para opcão do Usuário
            opcao = Integer.parseInt(JOptionPane.showInputDialog(" Escolha uma opção: \n"
                    + "01 \t02 \t03 \t04 \t05 \t06 \t07 \t08 \t09 \t10 \n"
                    + "11 \t12 \t13 \t14 \t15 \t16 \t17 \t18 \t19 \t20 \n"
                    + "21 \t22 \t23 \t24 \t25 \t26 \t27 \t28 \t29 \t30 \n"
                    + "\nUse 99 para sair \n"));

            switch (opcao) {

                //Opção para sair do Programa
                case 99:

                    System.out.println("Programa Finalizado com sucesso!!\n");

                    break;

                case 1:

                    Exercicio_01 exer_01;
                    exer_01 = new Exercicio_01();
                    exer_01.Executar_Programa_01();

                    break;

                case 2:

                    Exercicio_02 exer_02;
                    exer_02 = new Exercicio_02();
                    exer_02.Executar_Programa_02();

                    break;

                case 3:

                    Exercicio_03 exer_03;
                    exer_03 = new Exercicio_03();
                    exer_03.Executar_Programa_03();

                    break;

                case 4:

                    Exercicio_04 exer_04;
                    exer_04 = new Exercicio_04();
                    exer_04.Executar_Programa_04();

                    break;

                case 5:

                    Exercicio_05 exer_05;
                    exer_05 = new Exercicio_05();
                    exer_05.Executar_Programa_05();

                    break;

                case 6:

                    Exercicio_06 exer_06;
                    exer_06 = new Exercicio_06();
                    exer_06.Executar_Programa_06();

                    break;

                case 7:

                    Exercicio_07 exer_07;
                    exer_07 = new Exercicio_07();
                    exer_07.Executar_Programa_07();

                    break;

                case 8:

                    Exercicio_08 exer_08;
                    exer_08 = new Exercicio_08();
                    exer_08.Executar_Programa_08();

                    break;

                case 9:

                    Exercicio_09 exer_09;
                    exer_09 = new Exercicio_09();
                    exer_09.Executar_Programa_09();

                    break;

                case 10:

                    Exercicio_10 exer_10;
                    exer_10 = new Exercicio_10();
                    exer_10.Executar_Programa_10();

                    break;

                case 11:

                    Exercicio_11 exer_11;
                    exer_11 = new Exercicio_11();
                    exer_11.Executar_Programa_11();

                    break;

                case 12:

                    Exercicio_12 exer_12;
                    exer_12 = new Exercicio_12();
                    exer_12.Executar_Programa_12();

                    break;

                case 13:

                    Exercicio_13 exer_13;
                    exer_13 = new Exercicio_13();
                    exer_13.Executar_Programa_13();

                    break;

                case 14:

                    Exercicio_14 exer_14;
                    exer_14 = new Exercicio_14();
                    exer_14.Executar_Programa_14();

                    break;

                case 15:

                    Exercicio_15 exer_15;
                    exer_15 = new Exercicio_15();
                    exer_15.Executar_Programa_15();

                    break;

                case 16:

                    Exercicio_16 exer_16;
                    exer_16 = new Exercicio_16();
                    exer_16.Executar_Programa_16();

                    break;

                case 17:

                    Exercicio_17 exer_17;
                    exer_17 = new Exercicio_17();
                    exer_17.Executar_Programa_17();

                    break;

                case 18:

                    Exercicio_18 exer_18;
                    exer_18 = new Exercicio_18();
                    exer_18.Executar_Programa_18();

                    break;

                case 19:

                    Exercicio_19 exer_19;
                    exer_19 = new Exercicio_19();
                    exer_19.Executar_Programa_19();

                    break;

                case 20:

                    Exercicio_20 exer_20;
                    exer_20 = new Exercicio_20();
                    exer_20.Executar_Programa_20();

                    break;

                case 21:

                    Exercicio_21 exer_21;
                    exer_21 = new Exercicio_21();
                    exer_21.Executar_Programa_21();

                    break;

                case 22:

                    Exercicio_22 exer_22;
                    exer_22 = new Exercicio_22();
                    exer_22.Executar_Programa_22();

                    break;

                case 23:

                    Exercicio_23 exer_23;
                    exer_23 = new Exercicio_23();
                    exer_23.Executar_Programa_23();

                    break;

                case 24:

                    Exercicio_24 exer_24;
                    exer_24 = new Exercicio_24();
                    exer_24.Executar_Programa_24();

                    break;

                case 25:

                    Exercicio_25 exer_25;
                    exer_25 = new Exercicio_25();
                    exer_25.Executar_Programa_25();

                    break;

                case 26:

                    Exercicio_26 exer_26;
                    exer_26 = new Exercicio_26();
                    exer_26.Executar_Programa_26();

                    break;

                case 27:

                    Exercicio_27 exer_27;
                    exer_27 = new Exercicio_27();
                    exer_27.Executar_Programa_27();

                    break;

                case 28:

                    Exercicio_28 exer_28;
                    exer_28 = new Exercicio_28();
                    exer_28.Executar_Programa_28();

                    break;

                case 29:

                    Exercicio_29 exer_29;
                    exer_29 = new Exercicio_29();
                    exer_29.Executar_Programa_29();

                    break;

                case 30:

                    Exercicio_30 exer_30;
                    exer_30 = new Exercicio_30();
                    exer_30.Executar_Programa_30();

                    break;

                default:
                    System.out.println("Opção inválida!!");
                    break;
            }

        } while (opcao != 99);

        System.exit(0);
    }

}
