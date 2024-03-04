package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }


        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

	}

}
