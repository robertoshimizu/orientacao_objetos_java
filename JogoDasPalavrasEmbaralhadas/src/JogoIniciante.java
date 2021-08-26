
public class JogoIniciante implements MecanicaDoJogo {
	
	Embaralhador embaralhador;
	
	int points;

	@Override
	public String apresentacao() {
		
			return "Jogo Iniciante";
	

	}

	@Override
	public void iniciar() {
		this.points = 0;
		
	}

	@Override
	public Integer getPoints() {
		// TODO Auto-generated method stub
		return this.points;
	}

	@Override
	public boolean verificar(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
