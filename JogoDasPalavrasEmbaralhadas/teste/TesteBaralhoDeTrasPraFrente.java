import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteBaralhoDeTrasPraFrente {

	@Test
	void test() {
		Embaralhador emb = new BaralhoDeTrasPraFrente();
		String palavraEmbaralhada = emb.embaralhaPalavra("Catena");
		assertEquals("anetac", palavraEmbaralhada);
	}

}
