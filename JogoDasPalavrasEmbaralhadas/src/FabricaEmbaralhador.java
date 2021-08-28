
public class FabricaEmbaralhador {

	public Embaralhador createBaralho(int type) {
		
		Embaralhador baralho = null;
		
		if (type == 1) {
			baralho = new BaralhoDeTrasPraFrente();
		}
		
		return baralho;
	}

}
