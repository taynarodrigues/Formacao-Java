package JavaParteTres;

public abstract class Funcionario {
	private String nome;
	private int cpf;
	private double salario;

	// Construtor tem sempre o nome da classe porém não retorna nada
	public Funcionario() {

	}

	public double getBonificacao() {
		return this.salario * 0.05;
	}

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
