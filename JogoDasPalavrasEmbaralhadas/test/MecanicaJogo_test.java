import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MecanicaJogo_test {
	
	
	@Test
	@DisplayName("Apresentacao")
	void testApresentacao() {		
		MecanicaDoJogo sut = new JogoIniciante();
		assertEquals(sut.apresentacao(),"Jogo Iniciante");
	}
	
	@Test
	@DisplayName("Iniciar")
	void testInicializacao() {		
		MecanicaDoJogo sut = new JogoIniciante();
		sut.iniciar();		
		assertEquals(sut.getPoints(),0);
	}
	
	@Test
	@DisplayName("VerificacaoPalavra")
	void testVerificarPalavra() {		
		MecanicaDoJogo sut = new JogoIniciante();
		boolean result = sut.verificar("palavra");		
		assertEquals(result, false);
	}

}
