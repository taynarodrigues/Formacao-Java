package bytebankHerdado;

public class CalculadorDeImposto {
	
	private double totalImposto;

	//método
	public void resgistra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	//método  que devolve o valor total
	public double getTotalImposto() {
		return totalImposto;
	}
}
