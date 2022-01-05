package com.github.DaianaEgerMichels.oitavo;

import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("**JokenPo**");
		System.out.printf("Regras:%n R - Pedra %n P - Papel %n S - Tesoura %n");

		int jogadorUm, jogadorDois;
		jogadorUm = 0;
		jogadorDois = 0;

		String jogada;
		jogada = "";
		System.out.println("Informe a jogada:");
		jogada = keyboard.nextLine();

		while (jogada.length() > 0) {
			System.out.println("Informe a jogada:");
			jogada = keyboard.nextLine();

			if (jogada.equals("R S")) {
				jogadorUm++;
			} else if (jogada.equals("S P")) {
				jogadorUm++;
			} else if (jogada.equals("R P")) {
				jogadorDois++;
			} else if (jogada.equals("S R")) {
				jogadorDois++;
			} else if (jogada.equals("P S")) {
				jogadorDois++;
			} else if (jogada.equals("P R")) {
				jogadorUm++;
			} else if (jogada.equals("R R") || jogada.equals("S S") || jogada.equals("P P") || jogada.equals("")) {
				
				System.out.printf("----------------------------------------%n");
				System.out.printf("Placar: Jogador Um: %d x %d : Jogador Dois", jogadorUm, jogadorDois);
				keyboard.close();
				return;
			} else {
				System.out.println("Jogada inválida");
			}
		}
		
		System.out.println("Jogada inválida");
		
		keyboard.close();
		
	}

}
