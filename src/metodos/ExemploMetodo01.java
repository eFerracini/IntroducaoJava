package metodos;

public class ExemploMetodo01 {
	public static void main(String[] args) {
		
		int resultado = soma(2,5);
		
		System.out.println("O primeiro resultado é: "+resultado);
		
		mensagem();
	}
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void mensagem() {
		System.out.println("Olá!");
	}
	
}
