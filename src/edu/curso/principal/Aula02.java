package edu.curso.principal;

/*Imports*/
import java.util.Scanner;
import edu.curso.aula02.exercicio01.Exercicio01;
import edu.curso.aula02.exercicio02.Exercicio02;
import edu.curso.aula02.exercicio03.Exercicio03;
import edu.curso.aula02.exercicio04.Exercicio04;
import edu.curso.aula02.exercicio06.Exercicio06;
import edu.curso.aula02.exercicio07.Exercicio07;
import edu.curso.aula02.exercicio08.Exercicio08;

public class Aula02 {
    public void menu(Scanner scan) {
        /*Declarações de variáveis*/
        int opc = 0;

        /*
         * Menu de opções dos exercícios da aula 02 para o usuário. Cada opção 
         * represeta um exercício de POO.
         * Foi utilizado do "do while" para que o menu sempre esteja ativo
         * até que o usuário escolha. Isso permite que não seja mais
         * necessário reinciar o sistema para voltar ao menu de opções.
        */
        do {
            System.out.print("\n\n[MENU AULA 02]:\n\n" +
                            "1 - Exercicio 01.\n" +
                            "2 - Exercicio 02.\n" +
                            "3 - Exercicio 03.\n" +
                            "4 - Exercicio 04.\n" +
                            "5 - Exercicio 05.\n" +
                            "6 - Exercicio 06.\n" +
                            "7 - Exercicio 07.\n" +
                            "8 - Exercicio 08.\n" +
                            "0 - Voltar.\n\n" +
                            "R: ");
            opc = scan.nextInt();

            switch(opc) {
                case 1:
                    Exercicio01 exercicio01 = new Exercicio01();

                    System.out.println(exercicio01.resolucao(scan));
                    break;
                case 2:
                    Exercicio02 exercicio02 = new Exercicio02();

                    exercicio02.resolucao();
                    break;
                case 3:
                    Exercicio03 exercicio03 = new Exercicio03();

                    exercicio03.resolucao();
                    break;
                case 4:
                    Exercicio04 exercicio04 = new Exercicio04();

                    System.out.println(exercicio04.resolucao());
                    break;
                case 5:
                    System.out.println("\nClasses criadas!");
                    break;
                case 6:
                    Exercicio06 exercicio06 = new Exercicio06();

                    exercicio06.menuExercicio06(scan);
                    break;
                case 7:
                    Exercicio07 exercicio07 = new Exercicio07();
                    
                    System.out.print("\nDigite o valor do produto:\nR: ");
                    System.out.println("\nSaldo final: " + 
                    exercicio07.resolucao(scan.nextDouble()));
                    break;
                case 8:
                    Exercicio08 exercicio08 = new Exercicio08();

                    System.out.println("\nSaldo final: " +
                    exercicio08.resolucao(scan));
                    break;
                case 0:
                    System.out.println("\nVoltando...");
                    break;
                default:
                    System.err.println("\nO seu input nao foi reconhecido. " +
                                    "Peco que digite e envie os valores " +
                                    "fornecidos como opcoes. Exemplo:\n\n" +
                                    "1 - Opcao 1    --Eh pedido que envie o " +
                                    "valor 1 para escolher a opcao 1.");
            }
        } while(opc != 0);
    }
}