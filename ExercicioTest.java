package BancoDeQuestoes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ExercicioTest {

	@Test
	public void test() {
		Exercicio ex = new Exercicio();
		Dissertativa q = new Dissertativa("A cor do cavalo de napole�o:", "branco");
		ex.cadastraQuestaoDissertativa(q);
		List<Quest�o> quest = ex.getQuest�esEx();
		quest.contains(q);
	}

}
