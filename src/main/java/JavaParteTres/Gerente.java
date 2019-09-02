package JavaParteTres;

//gerente eh um funcionario, Gerente herda da class Funcionário, assina o contrato autenticável

public class Gerente extends Funcionario implements Autenticavel {

	// atributo guardado
	private AutenticacaoUtil autenticador;

	// criar construtor
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() { // reescrita -> a mesma assinatura...
		System.out.println("Chamando o método de bonificacao do gerente");
		return super.getSalario();

	}

	public void setsenha(int senha) {

		this.autenticador.setsenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
