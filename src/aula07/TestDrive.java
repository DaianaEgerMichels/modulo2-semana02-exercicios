package aula07;

public class TestDrive {

	public static void main(String[] args) {//classe para testar a classe Carro
		Carro car = new Carro(110); //passar a velocidade máxima, parametro do construtor
		//metodos da classe Carro:
		car.ligar();
		car.acelerar(80);
		car.frear(10);
		car.buzinar();
		car.desligar();
		
		
		System.out.println(car.velocidadeAtual);
		

	}

}
