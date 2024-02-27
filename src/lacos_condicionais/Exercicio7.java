package lacos_condicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		float numero1,numero2;
		
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		numero1 = read.nextFloat();
		
		System.out.print("Insira o segundo número: ");
		numero2 = read.nextFloat();
		
		System.out.println("Escolha uma das operações ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");		
		int operacao = read.nextInt();
		
		
		switch(operacao) {
		case 1:
			float soma = (numero1 + numero2);
			System.out.println("A soma dos número de "+numero1+ " + "+numero2+" = "+soma);
			break;
		case 2:
			float subtracao = (numero1 - numero2);
			System.out.println("A subtração dos número de "+numero1+" - "+numero2+" = "+subtracao);
			break;
		case 3:
			float multiplicacao = (numero1 * numero2);
			System.out.println("A multiplicação dos número de "+numero1+" * "+numero2+" = "+multiplicacao);
			break;
		case 4:
			float divisao = (numero1 / numero2);
			System.out.println("A Divisão dos número de "+numero1+" / "+numero2+" = "+divisao);
			break;
			
		default:System.out.println("Operação Inválida!");
		}
		
		read.close();
	}
	

}
