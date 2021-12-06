package meuBanco;

public class Conta {
	
	String nomeDoTitular;
	double saldo;
	
	void sacar(double valorSaque) {
		this.saldo -= valorSaque;
	}
	
	void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	} //void quer dizer que n�o retorna nada

	double getSaldo() {
		return this.saldo;
	}//sem void o m�todo deve retornar algo, ter um return
}
