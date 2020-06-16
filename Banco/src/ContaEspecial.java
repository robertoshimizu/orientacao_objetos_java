
public class ContaEspecial extends ContaCorrente {
	
	int limite;
	
	public ContaEspecial(int limite) {
		this.limite = limite;
	}
	
	// Subscreve o método sacar, adicionando limite cheque especial
	public int sacar(int valor) {
		if (valor > saldo + this.limite ) {
			return 0;
		}
		else {
			saldo = saldo - valor;
			return valor;
		}

	}

}
