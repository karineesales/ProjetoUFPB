package BancoDeQuestoes;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
	private List<Quest�o> quest�esEx = new ArrayList<Quest�o> ();
	
	public void cadastraQuestaoDissertativa(Dissertativa d){
		quest�esEx.add(d);
	}
	
	public List<Quest�o> getQuest�esEx(){
		return quest�esEx;
	}
}
