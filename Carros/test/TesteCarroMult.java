import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCarroMult {

CarroDeCorrida carro;
	
	@BeforeEach
	public void inicializaCarro() {
		carro = new CarroMult("teste", 1.5, 100);
	}

	@Test
	void testAcelerarUmaVez() {		
		carro.acelerar();
		assertEquals(10, carro.getVelocidade());		
	}
	
	@Test
	void testAcelerarDuasVezes() {		
		carro.acelerar();
		carro.acelerar();
		assertEquals(15, carro.getVelocidade());		
	}
	
	@Test
	void testAcelerarAteVelocidadeMaxima() {
		for(int i = 0; i < 14; i++)
			carro.acelerar();
		assertEquals(100, carro.getVelocidade());		
	}
	
	@Test
	public void testFrear() {		
		carro.acelerar();
		carro.frear();
		assertEquals(5, carro.getVelocidade());
	}
	
	@Test
	public void testFrearAteZero() {		
		carro.acelerar();
		for(int i = 0; i < 5; i++) {
			carro.frear();
		}
		assertEquals(0, carro.getVelocidade());
	}

}
