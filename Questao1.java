//Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00).

import java.util.Scanner;
public class Questao1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite apenas o valor da hora, (HH:MM): ");
        int HH = scanner.nextInt();
        System.out.println("Digite apenas o valor dos minutos, (HH:MM): ");
        int MM = scanner.nextInt();

        int total;
        total = (HH * 60) + MM;

        System.out.println("Desde o inicio do dia ate as " + HH + ":" + MM + ", se passaram " + total + " minutos");


        scanner.close();
    }
}