package lacos_condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		String nome,nomeC;
		int cargo;

		double salario;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Infome seu nome");
		nome = read.nextLine();
		
		System.out.println("Informe seu salário");
		salario = read.nextFloat();
		
		
		System.out.println(" 1 - Gerente");
		System.out.println(" 2 - Vendedor");
		System.out.println(" 3 - Supervisor");
		System.out.println(" 4 - Motorista");
		System.out.println(" 5 - Estoquista");
		System.out.println(" 6 - Técnico de TI");
		System.out.println("Digite o número do seu cargo");
		cargo = read.nextInt();
		
		switch(cargo) {
		case 1:
			nomeC = "Gerente";
			salario = salario+(salario*0.1);
			System.out.println("Colaborador "+nome+" Cargo "+nomeC+" salário R$"+salario);
			break;
			
		case 2:
			nomeC = "Vendedor";
			salario = salario+(salario*0.07);
			System.out.println("Colaborador "+nome+" Cargo "+nomeC+" salário R$"+salario);
			break;
			
		case 3:
			nomeC = "Supervisor";
			salario = salario+(salario*0.09);
			System.out.println("Colaborador "+nome+" Cargo "+nomeC+" salário R$"+salario);
			break;
			
		case 4:
			nomeC = "Motorista";
			salario = salario+(salario*0.06);
			System.out.println("Colaborador "+nome+" Cargo "+nomeC+" salário R$"+salario);
			break;
			
		case 5:
			nomeC = "Estoquista";
			salario = salario+(salario*0.05);
			System.out.println("Colaborador "+nome+" Cargo "+nomeC+" salário R$"+salario);
			break;
			
		case 6:
			nomeC = "Técnico de TI";
			salario = salario+(salario*0.08);
			System.out.println("Colaborador "+nome+" Cargo "+nomeC+" salário R$"+salario);
			break;
		}
		
		read.close();
	}

}
