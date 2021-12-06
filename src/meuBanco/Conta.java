package meuBanco;

public class Conta {
	
	String nomeDoTitular;
	double saldo;
	
	void sacar(double valorSaque) {
		this.saldo -= valorSaque;
	}
	
	void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	} //void quer dizer que não retorna nada

	double getSaldo() {
		return this.saldo;
	}//sem void o método deve retornar algo, ter um return
}
