package meuBanco;

public class Banco {

	public static void main(String[] args) {
		Conta minhaConta = new Conta(100);
		Conta segundaConta = new Conta("Kate", "da Silva", 12345);
		//Cliente cliente = new Cliente();
		//Cliente cliente2 = new Cliente();
		
		//cliente.nome = "Daiana Eger Michels";
		//cliente2.nome = "Kate da Silva";
		
		//minhaConta.cliente = cliente;
		minhaConta.titular.nome = "Daiana Eger Michels";
		//minhaConta.saldo = 100;
		
		//segundaConta.cliente = cliente2;
		//segundaConta.titular.nome = "Kate da Silva";
		segundaConta.saldo = 50;
		
		minhaConta.sacar(50);
		
		minhaConta.depositar(75);
		
		minhaConta.transferir(100, segundaConta);
		
		System.out.printf("O saldo atual do cliente %s é de %.2f",
				minhaConta.titular.nome, minhaConta.getSaldo());
		
		System.out.printf("O saldo atual do cliente %s é de %.2f",
				segundaConta.titular.nome, segundaConta.getSaldo());
	}

}
