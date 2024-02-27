package lacos_condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int produto,quantidade,valorTotal;
		
		Scanner read = new Scanner(System.in);

		System.out.println(" 1 - Cachorro Quente Valor R$ 10,00");
		System.out.println(" 2 - X-Salada  Valor R$ 15,00");
		System.out.println(" 3 - X-Bacon Valor R$ 18,00 ");
		System.out.println(" 4 - Bauru Valor R$ 12,00");
		System.out.println(" 5 - Refrigerante Valor R$ 8,00");
		System.out.println(" 6 - Suco de Laranja Valor R$ 13,00");
		
		System.out.print("Informe o código do produto ");
		produto = read.nextInt();
		
		System.out.print("Informe a quantidade do produto ");
		quantidade = read.nextInt();
		
		switch(produto) {
		case 1:
			valorTotal = quantidade * 10;
			System.out.println("O Cachorro Quente custará R$"+valorTotal);
			break;
		case 2:
			valorTotal = quantidade * 15;
			System.out.println("O X-Salada custará R$"+valorTotal);
			break;
		case 3:
			valorTotal = quantidade * 18;
			System.out.println("O X-Bacon custará R$"+valorTotal);
			break;
		case 4:
			valorTotal = quantidade * 12;
			System.out.println("O Bauru custará R$"+valorTotal);
			break;
		case 5:
			valorTotal = quantidade * 8;
			System.out.println("O Refrigerante custará R$"+valorTotal);
			break;
		case 6:
			valorTotal = quantidade * 13;
			System.out.println("O Suco de Laranja custará R$"+valorTotal);
			break;
			
		default:System.out.println("Código inválido");
		}
		
		read.close();
	}

}
