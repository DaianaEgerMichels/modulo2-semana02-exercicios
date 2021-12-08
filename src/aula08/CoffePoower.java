package aula08;

public class CoffePoower {
	private boolean isLigada;
	private int qtdAgua;
	private int qtdGraosCafe;
	
	private Filtro filtro;
	private Moedor moedor;
	
	CoffePoower(int qtdMaximaDeAgua, int qtdMaximaDeGraos) {
		this.isLigada = false;
		this.qtdAgua = qtdMaximaDeAgua;
		this.qtdGraosCafe = qtdMaximaDeGraos;
		
		this.filtro = new Filtro();
		this.moedor = new Moedor();
	}
	
	
	public void ligarCafeteira() {
		this.isLigada = true;
	}
	
	public void passarCafe(int qtdCafe) {
		if(this.podeFazerCafe()) {
			
			this.qtdAgua -= this.filtro.filtrarCafe();
			this.qtdGraosCafe -= this.moedor.moerCafe();
			
			System.out.println("Fazendo o café");
			
			
		}
	}
	
	/*public void passarCafe(int qtdCafe) {
		if(this.podeFazerCafe()) {
			this.moedor.moerCafe();
			this.filtro.filtrarCafe();
			
			System.out.println("Fazendo o café");
			
			this.qtdAgua -= qtdCafe;
			this.qtdGraosCafe -= qtdCafe;
		}
	}*/
	
	private boolean podeFazerCafe() {
		/*if(this.isLigada && this.qtdAgua>0 && this.qtdGraosCafe>0) {
			return true;
			} else {
			return false;
		}*/
		/*if(this.isLigada && this.qtdAgua>0 && this.qtdGraosCafe>0) {
		return true;
		} 
		return false;}
	*/
		
		//return this.isLigada && this.qtdAgua>0 && this.qtdGraosCafe>0;
		return this.isLigada && this.temAgua() && this.temGraos();
	}
	
	private boolean temAgua() {
		return qtdAgua>0;
	}
	
	private boolean temGraos() {
		return qtdGraosCafe>0;
	}
	
	
}
