package laco_repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int numero;
        int somaPositivos = 0;
        
        do {
            System.out.print("Digite um número: ");
            numero = read.nextInt();
            
            if (numero > 0) {
                somaPositivos += numero;
            }
        } while (numero != 0);
        
        System.out.println("A soma dos números positivos é: " + somaPositivos);
        
        read.close();

	}

}
