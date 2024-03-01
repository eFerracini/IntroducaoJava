package vetor_matriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		 int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		 
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o número que você deseja encontrar:");
	        int numero = scanner.nextInt();

	        int posicao = -1; 
	        
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numero) {
	                posicao = i; 
	                break; 
	            }
	        }


	        if (posicao != -1) {
	            System.out.println("O número " + numero + " está na posição " + posicao + " do vetor.");
	        } else {
	            System.out.println("Não foi encontrado!");
	        }
	 }
}