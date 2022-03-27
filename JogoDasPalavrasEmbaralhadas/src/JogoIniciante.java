
public class JogoIniciante implements MecanicaDoJogo {

	BancoDePalavras bancoPalavras;
	FabricaEmbaralhador factory;

	public JogoIniciante(BancoDePalavras bancoPalavras, FabricaEmbaralhador factory) {
		this.bancoPalavras = bancoPalavras;
		this.factory = factory;
	}

	private Embaralhador embaralhador;

	private String palavraEmbaralhada;
	private String novaPalavra;
	public int points;
	public int rodada;
	public int attempt;
	public boolean jogoEmAndamento = false;
	public boolean rodadaEmAndamento = false;

	@Override
	public String apresentacao() {
		String message = "\n Neste Jogo vc vai receber uma palavra embaralhada e terá 3 tentativas para decifrá-la \n Se acertar vc ganha 10 pontos. Você terá três rodadas \n Boa Sorte!";
		return message;
	}

	@Override
	public void iniciar() {
		this.points = 0;
		this.rodada = 1;
		this.jogoEmAndamento = true;
		this.attempt = 1;
		this.rodadaEmAndamento = true;
		embaralhador = factory.createBaralho();
	}

	public int getRodada() {
		return this.rodada;
	}

	public int getTentativa() {
		return this.attempt;
	}

	public boolean isJogoEmAndamento() {
		return this.jogoEmAndamento;
	}

	public boolean isRodadaEmAndamento() {
		return this.rodadaEmAndamento;
	}

	public void pegaNovaPalavraEmbaralhada() {
		this.rodadaEmAndamento = true;
		this.novaPalavra = bancoPalavras.novaPalavra();
		this.palavraEmbaralhada = embaralhador.embaralhaPalavra(novaPalavra);

	}

	public String mostraPalavraEmbaralhada() {
		return this.palavraEmbaralhada;
	}

	public String mostraPalavraOriginal() {
		return this.novaPalavra;
	}

	@Override
	public Integer getPoints() {
		// TODO Auto-generated method stub
		return this.points;
	}

	@Override
	public String verificar(String tentativa) {
		if (tentativa.equals(novaPalavra)) {
			this.points = this.points + 10;
			this.rodada = this.rodada + 1;
			this.attempt = 1;
			this.rodadaEmAndamento = false;
			if (this.rodada > 3) {

				this.jogoEmAndamento = false;
			}
			return "Acertou!! Você ganhou 10 pontos.";
		} else {
			this.attempt = this.attempt + 1;
			if (this.attempt > 3) {
				this.rodadaEmAndamento = false;
				this.attempt = 1;
				this.rodada = this.rodada + 1;
				return "Você errou!! - Rodada Finalizada - A palavra certa era: " + this.mostraPalavraOriginal();
			} else {
				return "Você errou!! - Não desanime";
			}

		}
	}

}