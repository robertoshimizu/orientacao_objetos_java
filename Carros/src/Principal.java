
public class Principal {

	public static void main(String[] args) {
		
		// cria uma corrida de 2000
		Corrida corridaDaAmizade = new Corrida(2000);
		
		// adiciona carros
		corridaDaAmizade.adicionaCarro(new CarroSoma("carroA", 10, 110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("carroB", 8, 110));
		corridaDaAmizade.adicionaCarro(new CarroMult("carroC", 1.7, 100));
		corridaDaAmizade.adicionaCarro(new CarroMult("carroD", 1.4, 110));
		
		// start
		corridaDaAmizade.StartRace();

	}

}
