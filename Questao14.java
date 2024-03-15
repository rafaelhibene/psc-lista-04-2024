// Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância entre eles, dada por d(P1,P2)=(x1-x2)2+(y1-y2)2 .


import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as coordenadas do primeiro ponto (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.println("Digite as coordenadas do segundo ponto (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println("A distância entre os pontos é: " + distancia);
        
        scanner.close();
    }
}