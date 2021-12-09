package mensagens;

import java.util.ArrayList;
import java.util.List;

public class Conversa {
	
	private List<Mensagem> timeline;
	private List<Pessoa> participantes;
	
	public Conversa(List<Pessoa> participantes) {
		this.timeline = new ArrayList<Mensagem>(); 
	}
	
	
}
