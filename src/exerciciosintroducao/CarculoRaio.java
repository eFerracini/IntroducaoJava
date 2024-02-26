package exerciciosintroducao;

import java.util.Scanner;

public class CarculoRaio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double area = PI * (raio*raio);

        System.out.printf("Área: %.4f\n", area);

        scanner.close();
    }
}