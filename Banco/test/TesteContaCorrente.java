import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteContaCorrente {
	
	ContaCorrente cc;
	
	@BeforeEach
	public void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}

	@Test
	void deposito() {		
		assertEquals(200, cc.saldo);
	}
	
	@Test
	void sacar() {		
		int valorSacado = cc.sacar(50);
		assertEquals(150, cc.saldo);
		assertEquals(50, valorSacado);
	}
	
	@Test
	void saqueMaiorQueSaldo() {		
		int valorSacado = cc.sacar(250);
		assertEquals(200, cc.saldo);
		assertEquals(0, valorSacado);
	}
	
	

}
