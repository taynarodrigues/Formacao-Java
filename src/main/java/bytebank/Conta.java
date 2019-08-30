package bytebank;

public class Conta {
	// atributos
	double saldo;
	int agencia = 1999;
	int numero = 928844;
	String titular;


	public void deposita(double valor) {
//		this.saldo = this.saldo + valor;
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
//			this.saldo = this.saldo - valor;
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
