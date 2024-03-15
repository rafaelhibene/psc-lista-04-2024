// Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir o custo mensal em energia elétrica com o equipamento inserido.

import java.util.Scanner;
public class Questao12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULE SEU GASTO DE ENERGIA POR EQUIPAMENTO:" );
        System.out.println("Digite a potencia do equipamento em Whatss: ");
        double potencia = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas que ele fica ligado por dia: ");
        double horas = scanner.nextDouble();

        System.out.println("Digite o valor do KW/H em R$ ");
        double valorKWH = scanner.nextDouble();

        double consumo = (potencia * horas) / 1000;

        double valorConsumido = consumo * valorKWH;

        double valorFinal = valorConsumido * 30;
        
        System.out.println("CONSUMO DE KW/H: " + consumo);
        System.out.println("VALOR PAGO PELO CONSUMO NO DECORRER DE UM MES: " + valorFinal);

        scanner.close();
    }
}