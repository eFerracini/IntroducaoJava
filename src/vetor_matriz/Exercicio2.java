package vetor_matriz;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        double[][] notas = new double[10][4]; 
        double[] medias = new double[10]; 
        Scanner scanner = new Scanner(System.in);

   
        System.out.println("Digite as notas dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Participante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = scanner.nextDouble();
            }
        }


        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4; 
            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
        }
    }
}