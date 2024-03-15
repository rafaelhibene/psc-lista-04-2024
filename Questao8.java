// Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos.

import java.util.Scanner;
public class Questao8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos MB tem o arquivo que se deseja baixar? ");
        double tamanho = scanner.nextDouble();
        
        System.out.println("Qual a velocidade do link em Mbps? ");
        double velocidade = scanner.nextDouble();

        double tempo = tamanho / velocidade;

        double minutos = tempo / 60;

        System.out.println("Serão necessarios " + minutos + " minutos para concluir o download.");

        scanner.close();
    }
}