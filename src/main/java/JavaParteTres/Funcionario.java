package JavaParteTres;

//Não pode instanciar dessa classe, porque é abstrata
public abstract class Funcionario {

	
	private String nome;
	private int cpf;
	private double salario;

	// método sem corpo, não há implementação
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int i) {
		this.cpf = i;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
