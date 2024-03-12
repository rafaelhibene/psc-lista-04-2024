//Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2 


import java.util.Scanner;
public class Questao3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro cateto (lado conhecido): ");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor do segundo cateto (lado conhecido): ");
        double b = scanner.nextDouble();
        
        double c;
        double aElevado = a * a;
        double bElevado = b * b; 

        c = Math.sqrt(aElevado + bElevado);

        System.out.println("O valor da hipotenusa é: " + c);

        scanner.close();
    }
}