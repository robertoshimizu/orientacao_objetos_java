import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteBaralhoTrocaLetrasImparesPorPares {

	@Test
	void testPalavraPar() {
		Embaralhador emb = new BaralhoTrocaLetrasImparesPorPares();
		String palavraEmbaralhada = emb.embaralhaPalavra("123456");
		assertEquals("214365", palavraEmbaralhada);
	}

	@Test
	void testPalavraImpar() {
		Embaralhador emb = new BaralhoTrocaLetrasImparesPorPares();
		String palavraEmbaralhada = emb.embaralhaPalavra("12345");
		assertEquals("21435", palavraEmbaralhada);
	}

}
