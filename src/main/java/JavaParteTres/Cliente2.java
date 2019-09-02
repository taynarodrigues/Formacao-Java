package JavaParteTres;

//implements -> está assinado um contrato

public class Cliente2 implements Autenticavel {

	private int senha;

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
