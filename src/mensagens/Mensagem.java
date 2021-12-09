package mensagens;

public class Mensagem {
	private Pessoa remetente;
	private String corpoDeTexto;
	
	public Mensagem(Pessoa remetente, string corpoDeTexto) {
		this.remetente = remetente;
		this.corpoDeTexto = corpoDeTexto;
	}
	
	public Pessoa getRemetente() {
		return remetente;
	}
	
	public Pessoa getCorpoDeTexto() {
		return corpoDeTexto;
	}
}
