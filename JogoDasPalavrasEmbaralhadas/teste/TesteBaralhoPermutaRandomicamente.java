import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TesteBaralhoPermutaRandomicamente {

	@Test
	void test() {
		Embaralhador emb = new BaralhoPermutaRandomicamente();
		String palavraEmbaralhada = emb.embaralhaPalavra("uva");
		List<String> lista1 = BaralhoPermutaRandomicamente.getLista();
		List<String> lista2 = Arrays.asList("uva", "uav", "vua", "vau", "avu", "auv");
		assertEquals(lista2, lista1);
		assertTrue(lista1.contains(palavraEmbaralhada));
	}

}
