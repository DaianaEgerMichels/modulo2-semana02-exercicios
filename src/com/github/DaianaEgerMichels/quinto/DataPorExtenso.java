package com.github.DaianaEgerMichels.quinto;

import java.util.Scanner;

public class DataPorExtenso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int dia, mes, ano;
		String dataInformada, mesExtenso;
		
		
		System.out.println("Informe um dia:");
		dia = entrada.nextInt();
		System.out.println("Informe um mês:");
		mes = entrada.nextInt();
		System.out.println("Informe um ano:");
		ano = entrada.nextInt();
		
		
			if (mes == 1) {
				mesExtenso = "janeiro";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
			} else if ( mes == 2) {
				mesExtenso = "fevereiro";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			} else if (mes == 3) {
				mesExtenso = "março";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			} else if (mes == 4) {
				mesExtenso = "abril";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			} else if (mes == 5) {
				mesExtenso = "maio";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			} else if (mes == 6) {
				mesExtenso = "junho";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			} else if (mes == 7) {
				mesExtenso = "julho";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			}else if (mes == 8) {
				mesExtenso = "agosto";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			}else if (mes == 9) {
				mesExtenso = "setembro";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			}else if (mes == 10) {
				mesExtenso = "outubro";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			}else if (mes == 11) {
				mesExtenso = "novembro";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			}else if (mes == 12) {
				mesExtenso = "dezembro";
				dataInformada = dia + " de " + mesExtenso + " de " + ano;
				System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
				System.out.println(dataInformada);
				
			}
			else{
				mesExtenso = "Mês inválido";
				System.out.println("Dado incorreto, mês inválido");
				dia = 0;
				ano = 0;
			} 
		
			entrada.close();
			//dataInformada = dia + " de " + mesExtenso + " de " + ano;
			//System.out.printf("%d de %s de %d%n", dia, mesExtenso, ano);
			//System.out.println(dataInformada);
		
		

	}

}
