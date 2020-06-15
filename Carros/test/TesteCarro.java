import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCarro {

	@Test
	void testAcelerar() {
		Carro carro = new Carro();
		carro.potencia = 10;
		carro.acelerar();
		assertEquals(10, carro.getVelocidade());
		
	}
	
	@Test
	public void testFrear() {
		Carro carro = new Carro();
		carro.potencia = 10;
		carro.acelerar();
		carro.frear();
		assertEquals(5, carro.getVelocidade());
	}
	
	@Test
	public void testFrearAteZero() {
		Carro carro = new Carro();
		carro.potencia = 10;
		carro.acelerar();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		assertEquals(0, carro.getVelocidade());
	}

}
