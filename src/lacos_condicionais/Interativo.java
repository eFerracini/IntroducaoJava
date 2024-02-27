package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		
		int x,y;
		
		
		Scanner read = new Scanner (System.in);

		System.out.print("Digite o valor de X ");
		x = read.nextInt();
		
		System.out.print("Digite o valor de Y ");
		y = read.nextInt();
		
		if (x > y) {
			System.out.println("X é maior que Y");
		} else if (x == y){
			System.out.println("Não tem maior");
		} else {
			System.out.println("Y é maior que X");
		}
		
		read.close();
	}

}
