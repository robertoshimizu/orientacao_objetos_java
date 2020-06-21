
public class Principal {

	public static void main(String[] args){
		System.out.println("Iniciando execução de main()");
		a(15);
		System.out.println("Finalizando execução de main()");
	}

	private static void a(int i){
		System.out.println("Iniciando execução de a() com: "+i);
		try {
			System.out.println("Antes de chamar b()");
			b(i);
			System.out.println("Depois de chamar b()");
		} catch (Exception e) {			
			System.out.println("Tratando a Exceção: "+ e.getMessage());
		}
		System.out.println("Finalizando execução de a() com: "+i);
	}

	private static void b(int i) throws Exception {
		System.out.println("Executando b() com: "+i);
		if (i > 10) {
			throw new Exception(i + " maior que 10");
		}	
		
	}

}
