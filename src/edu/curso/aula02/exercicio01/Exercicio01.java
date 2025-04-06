package edu.curso.aula02.exercicio01;

/*Imports*/
import java.util.Scanner;

public class Exercicio01 {
    public String resolucao(Scanner scan) {
        /*Declarações de variáveis*/
        double num1;
        double num2;

        /*Captura de dados do usuário*/
        System.out.print("\nDigite um valor para o numero 1:\nR: ");
        num1 = scan.nextDouble();
        System.out.print("\nDigite um valor para o numero 2:\nR: ");
        num2 = scan.nextDouble();

        /*Retorno do resultado da soma dos valores*/
        return "\nResultado: " + (num1 + num2);
    }
}