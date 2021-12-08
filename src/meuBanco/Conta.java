package meuBanco;

public class Conta {
	Cliente titular = new Cliente();
	String nome;
	double saldo;
	
	Conta(){
		//construtor vazio para poder inicializar a classe sem passar parametros
		//não é indicado fazer isto, para forçar o usuario da classe a fornecer os dados exigidos pela classe
	}
	
	Conta(double saldo){//construtor da classe
		this.saldo = saldo;
		//System.out.println("Conta inicializada");
	}
	
	Conta (String nome, String sobrenome, int cpf){
		//outro construtor
		this.titular.nome = nome;
		this.titular.sobrenome = sobrenome;
		this.titular.cpf = cpf;
	}
	
	Conta (String nome, String sobrenome, int cpf, double saldo){
		//outro construtor
		this(nome, sobrenome, cpf); //chama o construtor anterior
		this.saldo = saldo;
		//não da para chamar dois construtores dentro da mesma classe, assim no primeiro chamou no segundo se descreveu this.saldo=saldo;
	}
	
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
