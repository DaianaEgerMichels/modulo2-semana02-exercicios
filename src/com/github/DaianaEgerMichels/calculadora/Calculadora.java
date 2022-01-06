package com.github.DaianaEgerMichels.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numUm, numDois;
		String operacao;
		double resultado = 0;

		System.out.println("Digite o primeiro n�mero: ");
		numUm = entrada.nextInt();

		System.out.println("Digite o segundo n�mero: ");
		numDois = entrada.nextInt();
		entrada.nextLine();

		System.out
				.printf("Digite a opera��o desejada %n + (Soma) %n - (Subtra��o) %n / (Divis�o) %n * (Multiplica��o) ");
		operacao = entrada.nextLine();

		switch (operacao) {
		case "+":
			resultado = numUm + numDois;
			break;
		case "-":
			resultado = numUm - numDois;
			break;
		case "/":
			if (numDois == 0) {
				System.out.println("Divis�o inv�lida");
			} else {
				resultado = numUm / numDois;
			}
			break;
		case "*":
			resultado = numUm * numDois;
			break;
		default:
			System.out.println("Opera��o inv�lida");
		}

		System.out.printf("Resultado %.2f", resultado);
		entrada.close();
	}

}
