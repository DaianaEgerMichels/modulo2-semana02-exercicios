package br.com.daianamichels.segundasemana.quarto;

import java.util.Random;
import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {
		int numero, numAleatorio;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Adivinhe qual número de 1 a 5 estou pensando...");

		numero = entrada.nextInt();

		Random aleatorio = new Random(); // para gerar numero aleatorio

		numAleatorio = aleatorio.nextInt(5 + 1); // para gerar um numero entre 1 e 5

		while (numero != numAleatorio) {
			System.out.println("Você errou, o número correto era " + numAleatorio);

			System.out.println("Tente novamente...");

			numero = entrada.nextInt();
			numAleatorio = aleatorio.nextInt(5 + 1);
		}

		if (numero == numAleatorio) {
			System.out.println("Você acertou!");

		}

		entrada.close();
	}

}
