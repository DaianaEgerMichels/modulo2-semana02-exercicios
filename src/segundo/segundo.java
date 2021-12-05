package segundo;
import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		String sobrenome, nome;
		System.out.println("Qual é o seu sobrenome?");
		sobrenome = texto.nextLine();
		System.out.println("Qual é o seu nome?");
		nome = texto.nextLine();
		System.out.println("Olá, " + nome + " " + sobrenome);
		
		texto.close();

	}

}
