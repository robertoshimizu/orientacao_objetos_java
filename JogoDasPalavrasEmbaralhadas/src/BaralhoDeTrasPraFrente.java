
public class BaralhoDeTrasPraFrente implements Embaralhador {

	@Override
	public String embaralhaPalavra(String palavra) {
		// retorna palavra de tras pra frente
		return new StringBuilder(palavra).reverse().toString();
	}

}
