package exerciciosintroducao;

import java.util.Scanner;

public class RestoHora {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o tempo em segundos: ");
        int tempoSegundos = scanner.nextInt();

 
        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        System.out.println("Tempo formatado: " + horas + ":" + minutos + ":" + segundos);

        scanner.close();
    }
}