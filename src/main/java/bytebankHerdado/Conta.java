package bytebankHerdado;

public abstract class Conta {
	// atributos
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
		System.out.println("E agencia " + this.agencia);
	}

	//Métodos concretos
	public abstract void deposita(double valor);

	public void saca(double valor) {
		
		if (this.saldo < valor) {
			//problema
			//jogar o problema usar -> throw no singular "FAZ"
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;		
	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor negativo");
			return;
		}
		this.numero = numero;
	}

	public void getAgencia() {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
