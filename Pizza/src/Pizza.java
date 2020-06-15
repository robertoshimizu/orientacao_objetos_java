import java.util.HashMap;

public class Pizza {
	
	String nome;
	public Integer numIngredientes = 0;
	public double preco = 0;
	
	static HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();
	
	public Pizza(String nome) {		
		this.nome = nome;
	}
	
	public void adicionaIngrediente(String ingrediente) {
		contabilizaIngrediente(ingrediente);
		this.numIngredientes++;
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
		if(ingredientes.get(ingrediente) != null) {
			ingredientes.put(ingrediente,ingredientes.get(ingrediente)+1);
			}
		else {
			ingredientes.put(ingrediente,1);			
		}		
	}

	public double getPreco() {		
		
		if(this.numIngredientes <= 2) {
			this.preco = 15.0;
		} else if(this.numIngredientes <= 5) {
			this.preco = 20.0;
		} else {
			this.preco = 23.0;
		}
		return this.preco;	
		
	}

	public static void zeraRegistroIngredientes() {
		ingredientes.clear();		
	}

}
