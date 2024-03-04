package collection;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio3 {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        Stack<String> pilhaDeLivros = new Stack<>();

		        int opcao;
		        do {
		            System.out.println("\nMenu:");
		            System.out.println("1: Adicionar um novo livro na pilha");
		            System.out.println("2: Listar todos os livros da pilha");
		            System.out.println("3: Retirar um livro da pilha");
		            System.out.println("0: Sair do programa");
		            System.out.print("Escolha uma opção: ");
		            opcao = scanner.nextInt();

		            switch (opcao) {
		                case 1:
		                    scanner.nextLine(); // Limpar o buffer
		                    System.out.print("Digite o nome do livro a ser adicionado: ");
		                    String livro = scanner.nextLine();
		                    pilhaDeLivros.push(livro);
		                    System.out.println("Livro adicionado com sucesso!");
		                    break;
		                case 2:
		                    if (pilhaDeLivros.isEmpty()) {
		                        System.out.println("A pilha está vazia!");
		                    } else {
		                        System.out.println("Listando todos os livros da pilha:");
		                        for (String livroNaPilha : pilhaDeLivros) {
		                            System.out.println(livroNaPilha);
		                        }
		                    }
		                    break;
		                case 3:
		                    if (pilhaDeLivros.isEmpty()) {
		                        System.out.println("A pilha está vazia!");
		                    } else {
		                        String livroRetirado = pilhaDeLivros.pop();
		                        System.out.println("Livro retirado da pilha: " + livroRetirado);
		                    }
		                    break;
		                case 0:
		                    System.out.println("Programa finalizado.");
		                    break;
		                default:
		                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
		                    break;
		            }
		        } while (opcao != 0);
	}

}
