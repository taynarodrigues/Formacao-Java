package JavaParteTres;

public class Administrador extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	//criar o construtor
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}
	

	public void setsenha(int senha) {
		this.autenticador.setsenha(senha);
		
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}




}
