
public class RegsistroPontos {
	
	private CalculadoraBonus salbonus;
	
	RegsistroPontos(CalculadoraBonus cb){
		salbonus = cb;
	}
	
	public void fazerUmComentario(Usuario u) {
		u.pontos += 3 * salbonus.bonus(u);		
	}
	
	public void criarUmTopico(Usuario u) {
		u.pontos += 5 * salbonus.bonus(u);
		
	}
	public void darUmLike(Usuario u) {
		u.pontos += 1 * salbonus.bonus(u);
		
	}

}
