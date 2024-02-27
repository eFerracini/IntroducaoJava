package lacos_condicionais;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean doador;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Qual é o seu nome: ");
		nome = read.nextLine();
		
		System.out.print("Qual é a sua idade: ");
		idade = read.nextInt();
		
		System.out.print("É a sua primeira doação(true/false): ");
		doador = read.nextBoolean();
		
		if(idade >= 18 && idade <60) {
			System.out.println(nome+" está apto a doar sangue");
		} else if (idade >= 60 && idade <=69 && doador == false) {
			System.out.println(nome+" está apto a doar sangue");
		} else {
			System.out.println(nome+" não está apto a doar sangue");
		}
		
		read.close();
	}

}
