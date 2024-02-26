package exerciciosintroducao;

import java.util.Scanner;

public class CalculoDiferenca {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o 1° número: ");
		n1 = read.nextFloat();
		
		System.out.print("Digite o 2° número: ");
		n2 = read.nextFloat();
		
		System.out.print("Digite o 3° número: ");
		n3 = read.nextFloat();
		
		System.out.print("Digite o 4° número: ");
		n4 = read.nextFloat();
		
		float calculo = (n1 * n2)-(n3 * n4);
		
		System.out.println("Adiferença dele é de: " + calculo);
		
		read.close();

	}

}
