package lacos_condicionais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		float saldo = 1000;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		System.out.print("Digite o número da operação ");
		int operacao = read.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("O saldo da sua conta é de R$"+saldo);
			break;
		case 2:
			System.out.print("Informe o valor do saque: ");
			float saque = read.nextFloat();
			if(saque > saldo) {
				System.out.println("Saldo Insuficiente!");
			} else {
				saldo = (saldo - saque);
				System.out.println("Seu novo saldo é de R$"+saldo);
			}
			break;
		case 3:
			System.out.print("Informe o valor do depósito: ");
			float deposito = read.nextFloat();
			saldo = (deposito + saldo);
			System.out.println("Seu novo saldo é de R$"+saldo);
			break;
			
		default:System.out.println("Operação Inválida!");
			

		}
		
		read.close();
	}

}
