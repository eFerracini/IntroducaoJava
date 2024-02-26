package exerciciosintroducao;

import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		
		float nota1,nota2,nota3,nota4;
	
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite 1° nota: ");
		nota1 = leia.nextFloat();
		System.out.print("Digite 2° nota: ");
		nota2 = leia.nextFloat();
		System.out.print("Digite 3° nota: ");
		nota3 = leia.nextFloat();
		System.out.print("Digite 4° nota: ");
		nota4 = leia.nextFloat();
		
		float mediaFinal = ((nota1+nota2+nota3+nota4)/4);
		
		System.out.println("Sua média final é de: " + mediaFinal);
		
		leia.close();
	}

}
