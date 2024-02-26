package exerciciosintroducao;

import java.util.Scanner;

public class Cedulas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int valor = scanner.nextInt();


        int notas100 = valor / 100;
        valor %= 100;

        int notas50 = valor / 50;
        valor %= 50;

        int notas20 = valor / 20;
        valor %= 20;

        int notas10 = valor / 10;
        valor %= 10;

        int notas5 = valor / 5;
        valor %= 5;

        int notas2 = valor / 2;
        valor %= 2;

        int notas1 = valor;


        System.out.println("Valor lido: " + valor);
        System.out.println("Notas necessárias:");
        System.out.println("100: " + notas100);
        System.out.println("50: " + notas50);
        System.out.println("20: " + notas20);
        System.out.println("10: " + notas10);
        System.out.println("5: " + notas5);
        System.out.println("2: " + notas2);
        System.out.println("1: " + notas1);

        scanner.close();
    }
}