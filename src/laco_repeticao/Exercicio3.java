package laco_repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int idade;
        int totalMenores21 = 0;
        int totalMaiores50 = 0;
        
        System.out.print("Digite uma idade: ");
        idade = read.nextInt();
        
        while (idade >= 0) {
            if (idade < 21) {
                totalMenores21++;
            } else if (idade > 50) {
                totalMaiores50++;
            }
            
            System.out.print("Digite uma idade: ");
            idade = read.nextInt();
        }
        
        System.out.println("Total de pessoas menores de 21 anos: " + totalMenores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + totalMaiores50);
        
        read.close();

	}

}
