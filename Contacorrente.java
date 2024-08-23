package entidade;

public class Contacorrente extends Conta{

private double limite;

public Contacorrente(String nome, int numero, double saldo, double limite) {
	super(nome, numero, saldo);
	this.limite = limite;
}

@Override
public String toString() {
	return "Contacorrente [limite=" + limite + "]";
}


	

}
