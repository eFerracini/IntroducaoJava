package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		
		System.out.print("Insira sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Bom dia, " + nome + "Sua idade é " + idade);
			
		leia.close();
	}

}
