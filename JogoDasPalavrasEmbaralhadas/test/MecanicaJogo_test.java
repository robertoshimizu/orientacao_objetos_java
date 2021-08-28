import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MecanicaJogo_test {
	
	
	@Test
	@DisplayName("Testar a Fabrica Mecanica do Jogo")
	void testFabricaJogo() {		
		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		MecanicaDoJogo jogo = fabrica.createJogo(1);
		assertNotNull(jogo.apresentacao());
	}
	
	@Test
	@DisplayName("Testar a Fabrica Embaralhador")
	void testFabricaEmbaralhador() {				
		FabricaEmbaralhador factory = new FabricaEmbaralhador();
		Embaralhador embaralhador = factory.createBaralho(1);
		String palavraEmbaralhada = embaralhador.embaralhaPalavra("ANAGRAMA");
		assertEquals(palavraEmbaralhada, "AMARGANA");		
		
	}
	
	@Test
	@DisplayName("Apresentacao")
	void testApresentacao() {		
		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		MecanicaDoJogo sut = fabrica.createJogo(1);
		assertNotNull(sut.apresentacao());
	}
	
	@Test
	@DisplayName("Iniciar")
	void testInicializacao() {		
		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		MecanicaDoJogo sut = fabrica.createJogo(1);
		sut.iniciar();		
		assertEquals(sut.getPoints(),0);
	}
	
	@Test
	@DisplayName("VerificacaoPalavra")
	void testVerificarPalavra() {		
		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		MecanicaDoJogo sut = fabrica.createJogo(1);
		String result = sut.verificar("qq");		
		assertEquals(result, "Você errou!! - Não desanime");
	}
	
	@Test
	@DisplayName("Pega Nova Palavra no arquivo")
	void testPegaNovaPalavra() {		
		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		MecanicaDoJogo sut = fabrica.createJogo(1);
		sut.iniciar();
		assertNotNull(sut.mostraNovaPalavra());
	}

}
