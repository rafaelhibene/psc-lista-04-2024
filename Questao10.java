// A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.

import java.util.Scanner;
public class Questao10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso KG: ");
        double peso = scanner.nextDouble();

        double quantidadeIdeal = 35 * peso;
        double quantidadeIdealLitros = quantidadeIdeal / 1000;

        System.out.println("E recomendado que voce consuma "
        + quantidadeIdealLitros + " litros de agua por dia.");

        scanner.close();
    }
}