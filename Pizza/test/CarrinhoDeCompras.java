import java.util.HashMap;

public class CarrinhoDeCompras {
	
	static HashMap<String, Double> carrinho = new HashMap<String, Double>();
	public Integer quantidade = 0;
	private double total = 0;
	
	public CarrinhoDeCompras() {
		
	}

	public void adiciona(Pizza pizza) {
		if (pizza.numIngredientes== 0) {
			System.out.println("Pizza "+pizza.nome+" não pode ser adicionada sem ingredientes");
		}
		else {
			carrinho.put(pizza.nome, 1.0);
			this.quantidade++;
			this.total += pizza.getPreco();
		}		
		
	}

	public double getTotal() {
		// TODO Auto-generated method stub
		if (this.quantidade == 0) {
		return 0.0;
		}
		else {
			return this.total; 			
		}
	}	

}
