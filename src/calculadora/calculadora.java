package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Qual é o seu nome?");
		
		String nome;
		
		nome = entrada.nextLine();
		
		System.out.println("Digite o primeiro número");
		
		int primeiro, segundo;
		
		primeiro = entrada.nextInt();
		
		System.out.println("Digite o segundo número");
		
		segundo = entrada.nextInt();
		
		System.out.println("Olá, " + nome + ". O resultado da soma é: " + Integer.toString(primeiro + segundo));
		
		entrada.close();
		
		
	}

}
