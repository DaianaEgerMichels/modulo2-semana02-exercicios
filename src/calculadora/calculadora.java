package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual � o seu nome?");

		String nome;

		nome = entrada.nextLine();

		System.out.println("Digite o primeiro n�mero");

		int primeiro, segundo, soma; // se mudar o tipo da variavel para float ou double, lembrar de mudar a saida

		primeiro = entrada.nextInt(); // mudar saida para nextFloat ou nextDouble de acordo com o tipo da variavel

		System.out.println("Digite o segundo n�mero");

		segundo = entrada.nextInt();

		soma = primeiro + segundo;

		System.out.println("Ol�, " + nome + ". O resultado da soma �: " + soma + "."); // outra forma no lugar do soma:
																						// Integer.toString(primeiro +
																						// segundo)

		entrada.close();

	}

}
