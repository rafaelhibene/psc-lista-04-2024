// Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles.


import java.util.Scanner;
public class Questao11 {

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

        
        System.out.println("CONSUMO DE KW/H: " + consumo);
        System.out.println("VALOR PAGO PELO CONSUMO: " + valorConsumido);

        scanner.close();
    }
}