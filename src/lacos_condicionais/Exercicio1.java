package lacos_condicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int A,B,C;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o valor de A ");
		A = read.nextInt();
		
		System.out.print("Digite o valor de B ");
		B = read.nextInt();
		
		System.out.print("Digite o valor de C ");
		C = read.nextInt();
		
		if(A+B > C) {
			System.out.println("A Soma de A + B é Maior que C");
		}else if(A+B == C){
			System.out.println("A Soma de A + B é igual a C");
		} else {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		
		read.close();
	}

}
