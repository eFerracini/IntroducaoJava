package exerciciosintroducao;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		float salario;
		float abono;

		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite seu Abono: ");
		abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.println("Seu novo salário é de: "+ novoSalario);

		leia.close(); 
	}

}
