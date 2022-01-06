package com.github.DaianaEgerMichels.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numUm, numDois;
		String operacao;
		double resultado = 0;

		System.out.println("Digite o primeiro número: ");
		numUm = entrada.nextInt();

		System.out.println("Digite o segundo número: ");
		numDois = entrada.nextInt();
		entrada.nextLine();

		System.out
				.printf("Digite a operação desejada %n + (Soma) %n - (Subtração) %n / (Divisão) %n * (Multiplicação) ");
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
				System.out.println("Divisão inválida");
			} else {
				resultado = numUm / numDois;
			}
			break;
		case "*":
			resultado = numUm * numDois;
			break;
		default:
			System.out.println("Operação inválida");
		}

		System.out.printf("Resultado %.2f", resultado);
		entrada.close();
	}

}
