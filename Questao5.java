//Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora.


import java.util.Scanner;
public class Questao5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da base do retangulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite o tamanho da altura do retangulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = (base * 2) + (altura * 2);
        double aElevado = altura * altura;
        double bElevado = base * base;
        
        double diagonal = Math.sqrt(aElevado + bElevado);


        System.out.println("AREA = " + area);
        System.out.println("PERIMETRO = " + perimetro);
        System.out.println("DIAGONAL = " + diagonal);

        scanner.close();
    }
}
