package meuBanco;

public class Banco {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		minhaConta.nomeDoTitular = "Daiana Eger Michels";
		minhaConta.saldo = 100;
		
		minhaConta.sacar(50);
		
		minhaConta.depositar(75);
		
		System.out.printf("O saldo atual do cliente %s é de %.2f",
				minhaConta.nomeDoTitular, minhaConta.getSaldo());
	}

}
