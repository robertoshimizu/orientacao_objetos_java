import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		
		String nivelSelec = null;
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Bem Vindo ao Jogo das Palavras Embaralhadas!");
        System.out.println("");
        System.out.println("Selecione o nível do jogo:");
        System.out.println("1 - Principiante");
        System.out.println("2 - Avançado");
        System.out.println("");
        int nivel = sc.nextInt();
        System.out.println("");
        if (nivel == 1) {
        	nivelSelec = "Principiante";
        } else if (nivel == 2) {
        	nivelSelec = "Avançado";
        }       		
        
		System.out.println("Nivel Selecionado: "+ nivelSelec);
		
        MecanicaDoJogo jogo =  new JogoIniciante();
        jogo.iniciar();
        System.out.println(jogo.apresentacao());        
        System.out.println("");
        
        while (jogo.isJogoEmAndamento()){
	        System.out.println(Integer.toString(jogo.getRodada()) + " rodada");
	        System.out.println("A palavra Embaralhada é: " + jogo.pegaNovaPalavra());
	        
	        while (jogo.getTentativa()<=3) {
	        	System.out.println(Integer.toString(jogo.getTentativa()) + " tentativa");
	        	String tentativa = sc.next();
	        	System.out.println(jogo.verificar(tentativa));
	        	System.out.println("");
	        }
        
        }
        System.out.println("Acabô");
        System.out.println("Sua pontuação final foi: ");
      
        

	}

}
