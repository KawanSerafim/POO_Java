package edu.curso.principal.aulas;

import java.util.Scanner;

public class Aula04 {
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
            System.out.print("\n\n[MENU AULA 04]:\n\n" +
                            "1 - Exercicio 09.\n" +
                            "0 - Voltar.\n\n" +
                            "R: ");
            opc = scan.nextInt();

            switch(opc) {
                case 9:
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