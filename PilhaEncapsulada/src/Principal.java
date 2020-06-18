
public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		p.empilhar("Jose");
		p.empilhar("Maria");
		p.empilhar("Pedro");
		
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		System.out.println("-------------------");
		
		System.out.println(p.desempilhar());
		System.out.println(p.topo());
		System.out.println(p.tamanho());

	}

}
