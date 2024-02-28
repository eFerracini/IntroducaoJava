package laco_repeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("Digite o primeiro número do intervalo: ");
		int primeiroNumero = read.nextInt();

		System.out.print("Digite o último número do intervalo: ");
		int ultimoNumero = read.nextInt();

		if (primeiroNumero >= ultimoNumero) {
			System.out.println("Intervalo inválido. O primeiro número deve ser menor que o último.");
			System.exit(0);
		}

		System.out.println("No intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");

		for (int i = primeiroNumero; i <= ultimoNumero; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é múltiplo de 3 e 5");
			}
		}

		read.close();

	}

}
