package aula06;

import java.util.Scanner;

public class TestaData {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in); //para capturar o que for digitado
		
		System.out.println("Digite o dia da data: ");
		int diaDigitado = entrada.nextInt(); //captura o numero digitado e armazena na variavel
		
		System.out.println("Digite o mês da data: ");
		int mesDigitado = entrada.nextInt();
		
		System.out.println("Digite o ano da data: ");
		int anoDigitado = entrada.nextInt();
		
		Data data = new Data(); //chama a classe
		
		data.dia = diaDigitado; //atribui valor aos atributos da classe de acordo com o que foi digitado
		data.mes = mesDigitado;
		data.ano = anoDigitado;
		
		System.out.println(data.exibirData()); //exibe a data no formato do metodo da classe
		
		entrada.close(); //para encerrar o Scanner

	}

}
