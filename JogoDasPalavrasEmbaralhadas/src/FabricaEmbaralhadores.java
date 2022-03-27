import java.util.Random;

public class FabricaEmbaralhadores {

	public FabricaEmbaralhadores() {
		super();
	}

	private int getRandomNumberUsingNextInt(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

	public Embaralhador createEmbaralhador() {

		int num = getRandomNumberUsingNextInt(1, 4);

		switch (num) {
		case 1:
			return new BaralhoDeTrasPraFrente();
		case 2:
			return new BaralhoPermutaRandomicamente();
		case 3:
			return new BaralhoTrocaLetrasImparesPorPares();
		default:
			throw new IllegalStateException("Invalid random number: " + num);
		}

	}

}
