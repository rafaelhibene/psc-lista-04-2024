// Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida. Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.

import java.util.Scanner;
public class Questao6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULO QUANTIDADE DE REVESTIMENTO");
        System.out.println("Digite o comprimento da área que será revestida em metros: ");
        double comprimentoArea = scanner.nextDouble();
        System.out.println("Digite a largura da área que será revestida em metros: ");
        double larguraArea = scanner.nextDouble();

        
        System.out.println("Digite o comprimento da ceramica em metros: ");
        double comprimentoCeramica = scanner.nextDouble();
        System.out.println("Digite a largura da ceramica em metros: ");
        double larguraCeramica = scanner.nextDouble();

        double totalArea = comprimentoArea * larguraArea;
        double totalCeramica = comprimentoCeramica * larguraCeramica;

        double quantidadeCeramica = totalArea / totalCeramica;

        double total = quantidadeCeramica + (quantidadeCeramica * 0.10);

        double totalFinal = Math.ceil(total); 

        System.out.println("Serão utilizadas " + totalFinal + " ceramicas para preencher a area.");


        scanner.close();
    }
}
