package meuBanco;

public class Conta {
	
	String nomeDoTitular;
	double saldo;
	
	boolean temSaldo(double valorSaque) {
		if(valorSaque <= this.saldo) {
			return true;
		} else {
			return false;
		}
	}
	
	String sacar(double valorSaque) {
		if (valorSaque <= this.saldo) {
		this.saldo -= valorSaque;
		return "Saldo atual: " + this.saldo;
		} else {
			return "Saldo insuficiente";
		}
	}
	
	void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	} //void quer dizer que não retorna nada

	double getSaldo() {
		return this.saldo;
	}//sem void o método deve retornar algo, ter um return

	void transferir(double valorTransferencia, Conta contaDestino) {
		if (temSaldo(valorTransferencia)) {
			this.saldo -= valorTransferencia;
			contaDestino.saldo += valorTransferencia;
		}
	}
}
