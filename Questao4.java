//Crie um programa para calcular a regra de 3.


import java.util.Scanner;
public class Questao4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero (A): ");
        double a = scanner.nextDouble();
        System.out.println("Digite o segundo numero (B): ");
        double b = scanner.nextDouble();System.out.println("Digite o terceiro numero (C): ");
        double c = scanner.nextDouble();

        double x = (c * b) / a;

        System.out.println("O valor que voce deseja descobrir e: "
        + x);

        scanner.close();
    }
}