package JavaParteTres;

//gerente eh um funcionario, Gerente herda da class Funcionário, assina o contrato autenticável

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public double getBonificacao() { // reescrita -> a mesma assinatura...
		System.out.println("Chamando o método de bonificacao do gerente");
		return super.getSalario();

	}

	public void setsenha(int senha) {

		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
