package exerciciosintroducao;

import java.util.Scanner;

public class SalarioLiquido {
	
	public static void main(String[] args) {
		
		float salarioBruto,adicionalNoturno,horasExtras,descontos;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite seu salário bruto: ");
		salarioBruto = read.nextFloat();
		
		System.out.print("Digite o adicional noturno: ");
		adicionalNoturno = read.nextFloat();
		
		System.out.print("Digite suas horas extras: ");
		horasExtras = read.nextFloat();
		
		System.out.print("Digite os decontos: ");
		descontos = read.nextFloat();
		
		float salarioLiquido = (salarioBruto + adicionalNoturno + 
				((horasExtras * 5) - descontos));
		
		System.out.println("Seu salário liquido é de: " +salarioLiquido);
		
		read.close();

	}
}
