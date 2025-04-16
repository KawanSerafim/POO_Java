package edu.curso.principal.aulas;

import java.util.Scanner;

import edu.curso.aula04.exercicio09.Exercicio09;

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
                            "9 - Exercicio 09.\n" +
                            "0 - Voltar.\n\n" +
                            "R: ");
            opc = scan.nextInt();

            switch(opc) {
                case 9:
                    Exercicio09 exercicio09 = new Exercicio09();
                    String var1;
                    String var2;
                    String var3;
                    String var4;
                    
                    System.out.print("\n\nDigite um modelo para o motor do carro." +
                    "\nR: ");
                    var1 = scan.next();
                    System.out.print("\n\nDigite quantos cavalos tem o motor." +
                    "\nR: ");
                    var2 = scan.next();

                    System.out.print("\n\nDigite a CNH do motorista." +
                    "\nR: ");
                    var3 = scan.next();
                    System.out.print("\n\nDigite o nome do motorista." +
                    "\nR: ");
                    var4 = scan.next();

                    System.out.println(exercicio09.carro(var1, Integer.parseInt(var2), var3, var4));
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