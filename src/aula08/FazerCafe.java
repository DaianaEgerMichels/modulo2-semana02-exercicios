package aula08;

public class FazerCafe {
	private static final int QTD_MAX_AGUA = 100;
	private static final int QTD_MAX_GRAOS = 100;
	private static final int QTD_CAFEZINHO = 10;
	

	public static void main(String[] args) {
		CoffePoower cafe = new CoffePoower(QTD_MAX_AGUA, QTD_MAX_GRAOS);
		
		cafe.ligarCafeteira();
		cafe.passarCafe(QTD_CAFEZINHO);

	}

}
