package bytebankHerdado;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero); //passa os parâmetros do construtor específico
		
	}

	@Override
	public void deposita(double valor) {
		//super.saldo += valor;
		super.saldo = super.saldo + valor;
		
	}

}

//Os filhos são obrigados à implementar o método!