
public class CarroSoma extends CarroDeCorrida {
	
	private int potencia;
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}

	@Override
	public void acelerar() {
		velocidade += potencia;
		velocidade = velocidade > velocidadeMaxima ? velocidade = velocidadeMaxima : velocidade;
	}
	
	public void imprimir() {
		System.out.println("O carro "+nome+" está a velocidade de "+getVelocidade()+" km/h");
	}

}
