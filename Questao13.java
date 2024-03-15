// Escreva um programa que seja capaz de realizar a soma de duas frações, não é necessário simplificar. As entradas serão o numerador e, o denominador da primeira fração, seguidos do numerador e, o denominador da segunda fração. O resultado também deverá ser exibido em formato de fração. e.g: ⅗

import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SOMA  DE FRACOES: ");
        System.out.println("Digite o valor do numerador da primeira fracao: ");
        int numerador1 = scanner.nextInt();
        System.out.println("Digite o valor do denominador da primeira fracao: ");
        int denominador1 = scanner.nextInt();

        System.out.println("Digite o valor do numerador da segunda fracao: ");
        int numerador2 = scanner.nextInt();
        System.out.println("Digite o valor do denominador da segunda fracao: ");
        int denominador2 = scanner.nextInt();

        int numeradorSoma = numerador1 * denominador2 + numerador2 * denominador1;
        int denominadorSoma = denominador1 * denominador2;
        
        
        System.out.println("A soma das frações é: " + numeradorSoma + "/" + denominadorSoma);

        scanner.close();
    }
}