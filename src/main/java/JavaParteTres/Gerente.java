package JavaParteTres;
//Gerente é um funcionário, herda da class Funcionário

public class Gerente extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getBonificacao() { //reescrita -> a mesma assinatura...
		System.out.println("Chamando o método de bonificacao do gerente");
		return super.getSalario();
		
	}

}
