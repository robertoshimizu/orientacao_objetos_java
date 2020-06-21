import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TesteAutenticador {

	@Test
	void LoginSucesso() throws LoginException {
		Autenticador autenticador = new Autenticador();
		Usuario usuario = autenticador.logar("guerra", "senhadoguerra");
		assertEquals("guerra", usuario.getLogin());
	}
	
	// Teste falho tem que ser sucesso
	// JUnit5 mudou a sintaxe

	void LoginErrado(){		
		Assertions.assertThrows(LoginException.class, () -> { });
		Autenticador autenticador = new Autenticador();
		Usuario usuario = autenticador.logar("guerra", "senhaerradadoguerra");
	}
	
	// Teste falhando no try tem que ser sucesso, passar pelo fail()	
	@Test
	void LoginExcecao() {
		Autenticador autenticador = new Autenticador();
		try {
			Usuario usuario = autenticador.logar("guerra", "senhaerradadoguerra");
			fail();
		} catch (LoginException e) {
			assertEquals("guerra", e.getLogin());
		}
	}

}
