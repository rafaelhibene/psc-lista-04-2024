// Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, em centímetros, e exibir o peso ideal e o peso ideal ajustado. Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal Utilize este como referência para seus testes. Obs. O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo.

import java.util.Scanner;
public class Questao9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE IMC");

        System.out.println("Digite o peso em KG: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite a altura em CM: ");
        double alturaCM = scanner.nextDouble();

        System.out.println("Qual o seu sexo? Digite M para masculino e F para feminino: ");
        String sexo = scanner.next();

        double pesoIdeal, pesoIdealAjustado;

        if (sexo.equalsIgnoreCase("H")) {

            pesoIdeal = 52 + (0.75 * (alturaCM - 152.4));
            pesoIdealAjustado = ((peso - pesoIdeal) * 0.25) + pesoIdeal;

            System.out.println("PESO IDEAL = " + pesoIdeal);

            System.out.println("PESO IDEAL AJUSTADO = " + pesoIdealAjustado);
        } else {

            pesoIdeal = 52 + (0.67 * (alturaCM - 152.4));
            pesoIdealAjustado = ((peso - pesoIdeal) * 0.25) + pesoIdeal;
            
            System.out.println("PESO IDEAL = " + pesoIdeal);

            System.out.println("PESO IDEAL AJUSTADO = " + pesoIdealAjustado);


        }
        scanner.close();
    }
}