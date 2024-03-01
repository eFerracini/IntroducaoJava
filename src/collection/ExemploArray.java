package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArray {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		Scanner scanner = new Scanner(System.in);
		
		Double numeros;
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		System.out.println("Notas cadastradas: "+notas);
		
		System.out.print("Escreva o número que deseja procurar: ");
		numeros = scanner.nextDouble();
		
		System.out.println("Aposição da nota é: "+notas.indexOf(numeros));
		
	}

}
