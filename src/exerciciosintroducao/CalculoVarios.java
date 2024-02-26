package exerciciosintroducao;

import java.util.Scanner;

public class CalculoVarios {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor de A: ");
	        double A = scanner.nextDouble();

	        System.out.print("Digite o valor de B: ");
	        double B = scanner.nextDouble();

	        double soma = A + B;
	        double diferenca = A - B;
	        double multiplicacao = A * B;
	        double divisao = A / B;

	        System.out.println("Soma: " + soma);
	        System.out.println("Diferença: " + diferenca);
	        System.out.println("Multiplicação: " + multiplicacao);
	        System.out.println("Divisão: " + divisao);

	        scanner.close();
	    }
	}
