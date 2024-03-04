package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();

		// Solicitar ao usuário que insira 5 cores
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a cor " + (i + 1) + ":");
			String cor = scanner.nextLine();
			cores.add(cor);
		}

		// Mostrar todas as cores adicionadas
		System.out.println("\nListar todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		// Ordenar as cores
		Collections.sort(cores);

		// Mostrar as cores ordenadas
		System.out.println("\nOrdenar as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

	}

}
