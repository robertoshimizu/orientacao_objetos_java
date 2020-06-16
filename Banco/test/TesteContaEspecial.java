import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteContaEspecial extends TesteContaCorrente{
	
	ContaEspecial ce;
	
	@BeforeEach
	public void inicializaConta() {
		ce = new ContaEspecial(100);
		ce.depositar(200);
	}

		
	@Test
	void saqueMaiorQueSaldo() {		
		int valorSacado = ce.sacar(350);
		assertEquals(200, ce.saldo);
		assertEquals(0, valorSacado);
	}
	
	@Test
	void saqueMaiorQueSaldoDentroDoLimite() {		
		int valorSacado = ce.sacar(250);
		assertEquals(-50, ce.saldo);
		assertEquals(250, valorSacado);
	}

}
