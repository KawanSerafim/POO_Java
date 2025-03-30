import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor para o numero 1:");
        num1 = scan.nextDouble();
        System.out.println("Digite um valor para o numero 2:");
        num2 = scan.nextDouble();

        System.out.println("Resultado: " + (num1 + num2));
        scan.close();
    }
}