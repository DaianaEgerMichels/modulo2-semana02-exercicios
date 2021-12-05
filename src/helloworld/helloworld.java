package helloworld;

import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		int x = 10; //numero inteiro
		double y = 30;
		String texto = "Olá, DevInHouse"; //aspas duplas
		char caracter = '1'; //aspas simples
		final String CONST = "10"; //para criar uma constante usar final e letras maiúsculas
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(texto);
		System.out.println(caracter);
		System.out.println(CONST);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite Olá, Mundo!");
		String helloWorld = entrada.nextLine();
		System.out.println(helloWorld);
		entrada.close();
	}

}
