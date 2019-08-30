package JavaParteTres;

public class ControleBonificacao {

	private double soma;
	
	//Ter apenas um método genérico, Vantagem do Polimorfismo
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
