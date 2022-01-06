package com.github.DaianaEgerMichels.setimo;

import java.util.Scanner;

public class CaloriasDiarias {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Informe o sexo (Masculino => M ou Feminino => F):");
		String genero;
		genero = keyboard.next();
		
		if (!(genero.equals("M")|| genero.equals("F"))){
				System.out.println("Dado incorreto!");
				keyboard.close();
				return;
		}
		else {
	
		System.out.println("Informe quantos Kg deseja perder em um mês:");
		int perdaPeso = keyboard.nextInt();
		
		if (perdaPeso > 3) {
			System.out.println("Perder mais de 3 Kg em um mês pode ser prejudicial para a saúde");
			keyboard.close();
			return;
		} else {
		
		System.out.println("Informe o seu peso atual (Kg):");
		int peso = keyboard.nextInt();
		System.out.println("Informe a sua altura (cm):");
		int altura = keyboard.nextInt();
		System.out.println("Informe sua idade (anos):");
		int idade = keyboard.nextInt();
		System.out.println("Informe quantas horas (h) de atividade física pratica por dia:");
		int horasAtividade = keyboard.nextInt();
		
		int consumoAtividade = horasAtividade * 400;
		double perdaUm = -233.33;
		double perdaDois = -466.67;
		double perdaTres = -700;
		
		double caloriasHomem = 10 * peso + 6.25 * altura - 5*idade + 5;
		double caloriasMulher = 10 * peso + 6.25 * altura - 5*idade - 161;
		
		double consumoDiarioHomem;
		double consumoDiarioMulher;
		
		if(perdaPeso == 1) {
			consumoDiarioHomem = caloriasHomem - consumoAtividade - perdaUm;
			consumoDiarioMulher = caloriasMulher - consumoAtividade - perdaUm;
			} 
		else if (perdaPeso == 2) {
			consumoDiarioHomem = caloriasHomem - consumoAtividade - perdaDois;
			consumoDiarioMulher = caloriasMulher - consumoAtividade - perdaDois;
			}
		else {
			consumoDiarioHomem = caloriasHomem - consumoAtividade - perdaTres;
			consumoDiarioMulher = caloriasMulher - consumoAtividade - perdaTres;
			};
			
			if (genero.equals("M")) {
				System.out.printf("Você precisa de uma dieta de %.3f kcal/dia", consumoDiarioHomem);
			} else {
				System.out.printf("Você precisa de uma dieta de %.3f kcal/dia", consumoDiarioMulher);
			}
		}
		
		}
		
		keyboard.close();
	}

}
