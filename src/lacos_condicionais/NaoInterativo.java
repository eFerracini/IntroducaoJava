package lacos_condicionais;

import java.util.Scanner;

public class NaoInterativo {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = read.nextInt();
		
		read.close();
		
		if (idade >= 18) {
			
			System.out.println("Você é maior de idade");
		}else{
			
			System.out.println("Você é menor de idade");
		}

	}

}
