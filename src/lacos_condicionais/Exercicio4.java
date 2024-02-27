package lacos_condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String x,y,z;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("O animal é: Vertebrado ou Invertebrado?");
		x = read.next();
		
		System.out.println("O animal é: Ave,Mamimefero,Inseto ou Anelidio?");
		y = read.next();
		
		System.out.println("O animal é: Carnivoro,Onivoro,Herbivoro ou Hematofago?");
		z = read.next();
		
		if (x.equals("Vertebrado")&& y.equals("Ave")&& z.equals("Carnivoro")){
			System.out.println("Águia");
		}else if (x.equals("Vertebrado")&& y.equals("Ave")&& z.equals("Onivoro")) {
			System.out.println("Pomba");
		}else if (x.equals("Vertebrado")&& y.equals("Mamifero")&& z.equals("Onivoro")) {
			System.out.println("Homem");
		}else if (x.equals("Vertebrado")&& y.equals("Mamifero")&& z.equals("Herbivoro")) {
			System.out.println("Vaca");
		}else if (x.equals("Invertebrado")&& y.equals("Inseto")&& z.equals("Herbivoro")) {
			System.out.println("Lagarta");
		}else if (x.equals("Invertebrado")&& y.equals("Inseto")&& z.equals("Hematofago")) {
			System.out.println("Pulga");
		}else if (x.equals("Invertebrado")&& y.equals("Anelidio")&& z.equals("Hematofago")) {
			System.out.println("Sanguessuga");
		}else if (x.equals("Invertebrado")&& y.equals("Anelidio")&& z.equals("Onivoro")) {
			System.out.println("Minhoca");
		} else {
			System.out.println("Infomação incorreta, tente novamente.");
		}
		
		read.close();

	}

}
