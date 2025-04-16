package edu.curso.principal;

/*Imports*/
import java.util.Scanner;
import edu.curso.principal.aulas.Aula02;
import edu.curso.principal.aulas.Aula04;

public class Principal {
    public static void main(String[] args) {
        try {
            /*Declarações de variáveis*/
            int opc = 0;
            Scanner scan = new Scanner(System.in);

            /*
            * Menu de opções das aulas para o usuário. Cada opção represeta
            * uma aula de exercícios de POO.
            * Foi utilizado do "do while" para que o menu sempre esteja ativo
            * até que o sistema seja desligado. Isso permite que não seja mais
            * necessário reinciar o sistema para voltar ao menu de opções.
            */
            do {
                System.out.print("\n\n[MENU PRINCIPAL]:\n\n" +
                                "2 - Aula 02.\n" +
                                "4 - Aula 04.\n" +
                                "0 - Desligar.\n\n" +
                                "R: ");
                opc = scan.nextInt();

                switch(opc) {
                    case 2:
                        Aula02 aula02 = new Aula02();
                        aula02.menu(scan);
                        break;
                    case 4:
                        Aula04 aula04 = new Aula04();
                        aula04.menu(scan);
                        break;
                    case 0:
                        System.out.println("\nO sistema está sendo desligado...");
                        break;
                    default:
                        System.err.println("\nO seu input nao foi reconhecido. " +
                                        "Peco que digite e envie os valores " +
                                        "fornecidos como opcoes. Exemplo:\n\n" +
                                        "1 - Opcao 1    --Eh pedido que envie o " +
                                        "valor 1 para escolher a opcao 1.");
                }
            } while(opc != 0);

            scan.close();
        } catch(Exception e) {
            e.printStackTrace();
        } catch(StackOverflowError s) {
            s.printStackTrace();
            System.err.println("\n\nErro de estouro de memória! Foi intencional para o " +
                                "exercicio 2 da aula 02? Se nao for, temos um grave " + "problema O_O'");
        } catch(OutOfMemoryError o) {
            o.printStackTrace();
            System.err.println("\n\nErro de estouro da memória Heap! Foi " +
                                "intencional para o exercicio 3 da aula 02? Se nao for" + ", temos um grave problema O_O'");
        }
    }
}