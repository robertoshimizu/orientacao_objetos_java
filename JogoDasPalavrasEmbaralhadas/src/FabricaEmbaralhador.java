import java.util.Random;

public class FabricaEmbaralhador {

	public Embaralhador createBaralho() {

		Embaralhador baralho = null;

		Random rand = new Random();
		int low = 1;
		int high = 4;
		int sorteio = rand.nextInt(high - low) + low;
		// This gives you a random number in between low (inclusive) and high
		// (exclusive)

		switch (sorteio) {
		case 1:
			baralho = new BaralhoDeTrasPraFrente();
			break;
		case 2:
			baralho = new BaralhoPermutaRandomicamente();
			break;
		case 3:
			baralho = new BaralhoTrocaLetrasImparesPorPares();
			break;
		default:
			throw new IllegalStateException("Erro na fabrica baralho: " + sorteio);
		}
		return baralho;
	}

}
