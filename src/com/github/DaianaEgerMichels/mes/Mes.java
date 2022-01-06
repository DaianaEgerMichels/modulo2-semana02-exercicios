package com.github.DaianaEgerMichels.mes;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String mesNome;

		System.out.println("Digite o n�mero do m�s: ");
		int mes = entrada.nextInt();

		switch (mes) {
		case 1:
			mesNome = "Janeiro";
			break;
		case 2:
			mesNome = "Fevereiro";
			break;
		case 3:
			mesNome = "Mar�o";
			break;
		case 4:
			mesNome = "Abril";
			break;
		case 5:
			mesNome = "Maio";
			break;
		case 6:
			mesNome = "Junho";
			break;
		case 7:
			mesNome = "Julho";
			break;
		case 8:
			mesNome = "Agosto";
			break;
		case 9:
			mesNome = "Setembro, m�s do seu anivers�rio!!!";
			break;
		case 10:
			mesNome = "Outubro";
			break;
		case 11:
			mesNome = "Novembro, m�s que vem � Natal!!!";
			break;
		case 12:
			mesNome = "Dezembro, m�s do Natal";
			break;
		default:
			mesNome = "Esse m�s n�o existe!";

		}
		System.out.println(mesNome);
		entrada.close();
	}

}
