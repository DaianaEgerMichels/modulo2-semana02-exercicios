package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Qual � o seu nome?");
		
		String nome;
		
		nome = entrada.nextLine();
		
		System.out.println("Digite o primeiro n�mero");
		
		int primeiro, segundo;
		
		primeiro = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		
		segundo = entrada.nextInt();
		
		System.out.println("Ol�, " + nome + ". O resultado da soma �: " + Integer.toString(primeiro + segundo));
		
		entrada.close();
		
		
	}

}
