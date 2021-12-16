package segundo;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Segundo {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in); //para capturar a digitação no teclado
		String sobrenome, nome; //variaveis do tipo string
		int horaAtual, minutoAtual; //variaveis do tipo inteiro
		Date data = new Date(); //data e hora atual
		SimpleDateFormat hora = new SimpleDateFormat("HH");//para capturar a hora
		SimpleDateFormat minutos = new SimpleDateFormat("mm"); //para capiturar os minutos
		horaAtual = Integer.parseInt(hora.format(data));
		minutoAtual = Integer.parseInt(minutos.format(data)); //para transformar string em inteiro
		System.out.println("Qual é o seu sobrenome?");
		sobrenome = texto.nextLine();
		System.out.println("Qual é o seu nome?");
		nome = texto.nextLine();
		
		//System.out.println("Olá, " + nome + " " + sobrenome);
		
		if(horaAtual >=0 && horaAtual <= 12) {
			System.out.println("Bom dia, " + nome + " " + sobrenome + " a hora atual é " + horaAtual + ":" + minutoAtual);
		} 
		else if (horaAtual <= 18) {
			System.out.println("Boa tarde, " + nome + " " + sobrenome + " a hora atual é " + horaAtual + ":" + minutoAtual);
		} else {
			System.out.println("Boa noite, " + nome + " " + sobrenome + " a hora atual é " + horaAtual+ ":" + minutoAtual);
		}
		
		
		texto.close();//para encerrar o scanner

	}

}
