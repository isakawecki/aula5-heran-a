package entidade;

public class Contapoupanca extends Conta {

	
	
	public Contapoupanca(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
	}

	@Override
	public String toString() {
		return "Contapoupanca [saldo]";
	}
}



	