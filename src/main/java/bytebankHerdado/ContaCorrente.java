package bytebankHerdado;

//New ContaCorrente
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}
	
	@Override //Anotção->Configuração->Compilador //SobreEscrever um método
	
	public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
