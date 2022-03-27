
public interface MecanicaDoJogo {

	public String apresentacao();

	public void iniciar();

	public String mostraPalavraOriginal();

	public Integer getPoints();

	public String verificar(String tentativa);

	public int getRodada();

	public int getTentativa();

	public boolean isJogoEmAndamento();

	public boolean isRodadaEmAndamento();

	public void pegaNovaPalavraEmbaralhada();

	public String mostraPalavraEmbaralhada();

}