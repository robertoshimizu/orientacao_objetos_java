
public class JogoIniciante implements MecanicaDoJogo {
	
	BancoDePalavras bancoPalavras;
	FabricaEmbaralhador factory;
	
	public JogoIniciante(BancoDePalavras bancoPalavras,FabricaEmbaralhador factory) {
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

	@Override
	public String apresentacao() {		
		String message = "\n Neste Jogo vc vai receber uma palavra embaralhada e terá 3 tentativas para decifrá-la \n Se acertar vc ganha 10 pontos. Você terá três rodadas \n Boa Sorte!";
		return message;
	}

	@Override
	public void iniciar() {		
		points = 0;
		rodada = 1;
		jogoEmAndamento = true;		
		embaralhador = factory.createBaralho(1);
	}

	public int getRodada() {
		return rodada;
	}

	public int getTentativa() {
		return attempt;
	}

	public boolean isJogoEmAndamento() {
		return jogoEmAndamento;
	}

	public String pegaNovaPalavra() {	
		attempt = 1;
		novaPalavra = bancoPalavras.novaPalavra();		
		palavraEmbaralhada = embaralhador.embaralhaPalavra(novaPalavra);
		return palavraEmbaralhada;
	}

	public String mostraNovaPalavra() {		
		return pegaNovaPalavra();
	}

	@Override
	public Integer getPoints() {
		// TODO Auto-generated method stub
		return this.points;
	}

	@Override
	public String verificar(String tentativa) {
		if (tentativa.equals(novaPalavra)) {			
			points = points + 10;
			rodada = rodada + 1;
			if (rodada > 3) {
				jogoEmAndamento = false;
			}
			attempt = 5;
			return "Acertou!! Você ganhou 10 pontos.";
		}
		else { 
			attempt = attempt + 1;
			return "Você errou!! - Não desanime";
			
		}
	}

}
