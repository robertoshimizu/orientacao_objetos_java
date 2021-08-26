
public interface MecanicaDoJogo {
	
	public String apresentacao();

	public void iniciar();
	
	public String pegaNovaPalavra();
	
	public String mostraNovaPalavra();

	public Integer getPoints();

	public String verificar(String tentativa);
	
	public int getRodada();

	public int getTentativa();
	
	public boolean isJogoEmAndamento();

}
