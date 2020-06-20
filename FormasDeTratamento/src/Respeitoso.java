
public class Respeitoso implements FormatadorNome {
	
	String gender;		

	public Respeitoso(String gender) {
		super();
		this.gender = gender;
	}


	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (gender == "M") return "Sr. "+nome+" "+sobrenome;
		else return "Sra. "+nome+" "+sobrenome;				
	}

}
