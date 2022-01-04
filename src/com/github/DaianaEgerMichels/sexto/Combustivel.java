package com.github.DaianaEgerMichels.sexto;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o pre�o por litro do Etanol");
		int etanol = entrada.nextInt();
		System.out.println("Informe o pre�o por litro da Gasolina");
		int gasolina = entrada.nextInt();
		System.out.println("Informe o rendimento do carro (km) por litro de Etanol");
		int rendimentoEtanol = entrada.nextInt();
		System.out.println("Informe o rendimento do carro (km) por litro de Gasolina");
		int rendimentoGasolina = entrada.nextInt();
		System.out.println("Informe a rodagem m�dia do ve�culo(km)");
		int rodagem = entrada.nextInt();

		int mediaEtanol, mediaGasolina;
		
		
		mediaEtanol = etanol * rendimentoEtanol;
		mediaGasolina = gasolina * rendimentoGasolina;
		
		int custoEtanol, custoGasolina;
		
		custoEtanol = mediaEtanol* rodagem;
		custoGasolina = mediaGasolina * rodagem;
		
		String combustivelIndicado;
		
		if (custoEtanol > custoGasolina) {
			combustivelIndicado = "GASOLINA";
			System.out.printf("O Combust�vel com melhor custo-benef�cio � a %s", combustivelIndicado);
			
		} else if (custoEtanol < custoGasolina) {
			combustivelIndicado = "ETANOL";
			System.out.printf("O Combust�vel com melhor custo-benef�cio � o %s", combustivelIndicado);
			
		} else {
			combustivelIndicado = "AMBOS";
			System.out.printf("%s os Combust�veis tem um bom custo-benef�cio", combustivelIndicado);
		}
		
		entrada.close();
		
	}

}
