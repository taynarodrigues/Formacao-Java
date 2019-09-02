package JavaParteTres;

public class Administrador extends Funcionario implements Autenticavel{

	private int senha;
	
	@Override
	public double getBonificacao() {
		return 50;
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
