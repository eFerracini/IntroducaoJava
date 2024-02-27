package lacos_condicionais;

import java.util.Scanner;

public class Operador {

	public static void main(String[] args) {
		
		int idade;
		boolean carteiraM;
		
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = read.nextInt();
		
		System.out.print("Você tem carteira de Habilitação? (true/false)");
		carteiraM = read.nextBoolean();
		
		if(idade >= 18 && carteiraM) {
			System.out.println("Você pode dirigir");
		} else {
			System.out.println("Você não pode dirigir");
		}
		
		read.close();
	}

}
