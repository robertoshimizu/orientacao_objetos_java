
public class ContaCorrente {
	int saldo = 0;
	
	public int sacar(int valor) {
		if (valor > saldo) {
			return 0;
		}
		else {
			saldo = saldo - valor;
			return valor;
		}

	}
	
	public void depositar(int valor) {
		saldo =+ valor;
		
	}

}
