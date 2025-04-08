package edu.curso.aula02.exercicio08;

import java.util.Scanner;
import edu.curso.aula02.exercicio07.Caixa;

public class Exercicio08 {
    public String resolucao(Scanner scan) {
        Caixa caixa = new Caixa();
        int opc = 0;
        double valorProduto;

        do {
            System.out.print("\n\nQuer adicionar um novo produto?\n\n" +
                            "0 - Nao.\n" +
                            "1 - Sim.\n" +
                            "R: ");
            opc = scan.nextInt();

            switch(opc) {
                case 1:
                    System.out.print("\n\nQual o valor do produto?\nR: ");
                    valorProduto = scan.nextDouble();
                    caixa.setSaldo(valorProduto);
                    break;
                case 0:
                    break;
                default:
                    System.err.println("\nO seu input nao foi reconhecido. " +
                                    "Peco que digite e envie os valores " +
                                    "fornecidos como opcoes. Exemplo:\n\n" +
                                    "1 - Opcao 1    --Eh pedido que envie o " +
                                    "valor 1 para escolher a opcao 1.");
            }
        } while(opc != 0);

        return caixa.venda();
    }
}