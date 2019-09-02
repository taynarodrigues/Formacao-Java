package bytebankHerdado;

public class TestesTributaveis {
	
	public static void main(String[] args) {
		
		//criado objeto conta corrente
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		//criado objeto seguro de vida
		SeguroDeVida seguro = new SeguroDeVida();
		
		
		//criado objeto calculador de imposto
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.resgistra(cc);
		calc.resgistra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}

}
