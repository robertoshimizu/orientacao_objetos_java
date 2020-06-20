import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AutoridadeTest {
	
	Autoridade autoridade;

	@BeforeEach
	void testAutoridade() {
		autoridade = new Autoridade("Pedro", "Cabral");
		assertEquals("Pedro", autoridade.nome);
		assertEquals("Cabral", autoridade.sobrenome);
	}
	
	
	@Test
	void testGetTratamentoInformal() {
		assertEquals("Pedro", autoridade.getTratamento("informal", null));		
	}
	
	@Test
	void testGetTratamentoRespeitoso() {
		assertEquals("Sr. Pedro Cabral", autoridade.getTratamento("respeitoso", "M"));		
	}
	
	@Test
	void testGetTratamentoComTitulo() {
		assertEquals("Excelentíssimo Pedro Cabral", autoridade.getTratamento("comtitulo", "Excelentíssimo"));		
	}

}
