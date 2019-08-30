package bytebanckCompostoEncapsulado;

public class ContaGettersESetters {

	private String titular;
	private double saldo;

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void saca(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
		}
	}

	public void deposita(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

}
