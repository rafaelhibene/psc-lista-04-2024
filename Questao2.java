//Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha, com base no custo.


import java.util.Scanner;
public class Questao2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da gasolina: R$ ");
        double gasolina = scanner.nextDouble();
        System.out.println("Digite o valor do etanol: R$ ");
        double etanol = scanner.nextDouble();

        double limite = 0.7 * gasolina;

        if (etanol <= limite ) {
            System.out.println("Vale a pena abastecer com etanol");
        }
        else {
            System.err.println("Vale a pena abastecer com gasolina");
        }
        
        
        scanner.close();
    }
}