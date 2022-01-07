package com.github.DaianaEgerMichels.palindromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Digite um palindromo: ");

		String entrada = keyboard.nextLine();

		String inversaoPalavra = "";

		for (int i = entrada.length() - 1; i >= 0; i--) {
			inversaoPalavra += entrada.charAt(i); //charAt retorna o caracter da referida posição
		}
		
		/*if(inversaoPalavra.equals(entrada)) {
			System.out.println("É um palindromo!");
		} else {
			System.out.println("Não é um palindromo!");
		}  
		:::::::::::FAZENDO COM IF TERNÁRIO::::::::
		*/
		
		System.out.println(inversaoPalavra.equals(entrada) ? "É um palindromo!": "Não é um palindromo!");

		keyboard.close();

	}

}
