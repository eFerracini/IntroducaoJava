package laco_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {

		String nome;
		int contador;

		Scanner read = new Scanner(System.in);

		for (contador = 0; contador <= 2; contador++) {

			System.out.print("Digite o " + (contador + 1) + "º nome: ");
			nome = read.nextLine();
			System.out.println("O " + (contador + 1) + "º nome é: " + nome);

		}

		read.close();
	}

}
