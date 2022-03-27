import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TesteBancoDePalavras {

	@Test
	void TestePegaNovaPalavra() {
		BancoDePalavras bancoPal = new BancoDePalavras();
		assertTrue(bancoPal.novaPalavra() instanceof String);
	}

}
