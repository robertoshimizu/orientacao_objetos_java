
public class FabricaMecanicaDoJogo {

	BancoDePalavras bancoPalavras;
	FabricaEmbaralhador factory;

	public FabricaMecanicaDoJogo() {
		this.factory = new FabricaEmbaralhador();
		this.bancoPalavras = new BancoDePalavras();
	}

	public MecanicaDoJogo createJogo(int nivel) {
		MecanicaDoJogo jogo = null;
		if (nivel == 1) {
			jogo = new JogoIniciante(bancoPalavras, factory);
		}

		return jogo;
	}

}
