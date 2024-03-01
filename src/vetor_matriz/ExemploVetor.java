package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {

		String cachorros[] = new String[3];

		Scanner read = new Scanner(System.in);

		int indice;

		for (indice = 0; indice < cachorros.length; indice++) {

			System.out.print("Digite o " + (indice + 1) + "° nome: ");
			cachorros[indice] = read.nextLine();
		}

		for (indice = 0; indice < cachorros.length; indice++) {
			System.out.println((indice + 1) + "° o númeor " + cachorros[indice]);
			
		}
		
		read.close();
	}

}
