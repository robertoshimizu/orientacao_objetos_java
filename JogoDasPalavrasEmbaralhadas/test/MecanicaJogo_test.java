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
		String result = sut.verificar("qq");		
		assertEquals(result, "qq");
	}
	
	@Test
	@DisplayName("Pega Nova Palavra no arquivo")
	void testPegaNovaPalavra() {		
		MecanicaDoJogo sut = new JogoIniciante();
		sut.iniciar();
		assertNotNull(sut.mostraNovaPalavra());
	}

}
