
public class CarroMult extends CarroDeCorrida {
	
	private double potencia;

	public CarroMult(String nome, double potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = (potencia > 1 && potencia < 2) ? potencia : 1.5;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		if (velocidade == 0) {
			velocidade = 10;
		} else {
			velocidade *= potencia;
			velocidade = velocidade > velocidadeMaxima ? velocidade = velocidadeMaxima : velocidade;			
		}

	}

}
