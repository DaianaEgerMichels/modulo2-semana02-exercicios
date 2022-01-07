package com.github.DaianaEgerMichels.mediaNotas;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int QTD_NOTAS; // declaração de uma constante
		QTD_NOTAS = 3;
		
		float somaNotas = 0.00f;
		
		System.out.println("Digite o nome do aluno: ");
		String nomeAluno = entrada.nextLine();
		
		for (int i = 0; i < QTD_NOTAS; i++) {
			System.out.printf("Digite a nota %s do aluno: ", i + 1);
			somaNotas += entrada.nextFloat();
		}
		
		float media = somaNotas / QTD_NOTAS;
		
		System.out.printf("Aluno: %s %nMédia: %.2f",nomeAluno, media);

	}

}
