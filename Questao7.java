// Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.

import java.util.Scanner;
public class Questao7 {
    
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
        System.out.println("Digite o valor do metro quadrado da ceramica: ");
        double valorCeramica = scanner.nextDouble();

        double totalArea = comprimentoArea * larguraArea;
        double totalCeramica = comprimentoCeramica * larguraCeramica;

        double quantidadeCeramica = totalArea / totalCeramica;

        double total = quantidadeCeramica + (quantidadeCeramica * 0.10);

        double totalFinal = Math.ceil(total); 

        System.out.println("Serão utilizadas " + totalFinal + " ceramicas para preencher a area.");

        double preco = totalFinal * valorCeramica;

        System.out.println("O valor total gasto sera de: R$ " + preco);
        scanner.close();
    }
}
