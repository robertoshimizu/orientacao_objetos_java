
public class Principal {

	public static void main(String[] args) {
		Barulhento[] barulhentos =  new Barulhento[3];
		
		barulhentos[0] = new Cachorro();
		barulhentos[1] = new Carro();
		barulhentos[2] = new Bateria();
		
		sons(barulhentos);
			
	}

	private static void sons(Barulhento[] barulhentos) {
		for (Barulhento b: barulhentos) {
			System.out.println(b.fazerBarulho());
		}
		
	}

}
