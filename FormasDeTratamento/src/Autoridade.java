
public class Autoridade {
	
	String nome;
	String sobrenome;
	
	
	public Autoridade(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getTratamento(String tipo, String params) {
		
		switch (tipo) {
		case "informal":			
			return new Informal().formatarNome(nome, sobrenome);
			
		case "respeitoso":			
			return new Respeitoso(params).formatarNome(nome, sobrenome);
			
		case "comtitulo":			
			return new ComTitulo(params).formatarNome(nome, sobrenome);	

		default:
			return null;
		}		
		
	}
	

	
	

}
