package meuBanco;

public class ObjetoJava {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 100;
		
		Conta c2 = c1;
		c2.saldo = 200;
		
		System.out.printf("O saldo de c1 � %f%n", c1.saldo);
		System.out.printf("O saldo de c2 � %f", c2.saldo);

	}

}
