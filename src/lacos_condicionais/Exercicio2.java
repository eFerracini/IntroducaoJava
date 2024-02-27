package lacos_condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		x = read.nextInt();
		
		if (x%2 == 0 && x >=0) {
			System.out.println("O número "+x+" é par e positivo!");
		} else if(x%2 == 0 && x < 0) {
			System.out.println("O número "+x+" é par e negativo!");
		} else if(x%2 == 1 && x >= 0) {
			System.out.println("O número "+x+" é impar e positivo!");
		} else {
			System.out.println("O número "+x+" é impar e negativo!");
		}
		
		read.close();
	}

}
