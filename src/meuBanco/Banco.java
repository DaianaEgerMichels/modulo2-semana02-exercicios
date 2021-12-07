package meuBanco;

public class Banco {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		Conta segundaConta = new Conta();
		
		minhaConta.nomeDoTitular = "Daiana Eger Michels";
		minhaConta.saldo = 100;
		
		segundaConta.nomeDoTitular = "Kate da Silva";
		segundaConta.saldo = 50;
		
		minhaConta.sacar(50);
		
		minhaConta.depositar(75);
		
		minhaConta.transferir(100, segundaConta);
		
		System.out.printf("O saldo atual do cliente %s é de %.2f",
				minhaConta.nomeDoTitular, minhaConta.getSaldo());
		
		System.out.printf("O saldo atual do cliente %s é de %.2f",
				segundaConta.nomeDoTitular, segundaConta.getSaldo());
	}

}
