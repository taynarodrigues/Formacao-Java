package JavaParteTres;

//implements -> está assinado um contrato

public class Cliente2 implements Autenticavel {

	
	//guardar um atributo, declarando uma variável
	private AutenticacaoUtil autenticador;
	
	
	//criar um construtor padrão e criar uma instancia da AutenticacaoUtil
	public Cliente2() {
		 this.autenticador = new AutenticacaoUtil();
	}

	public void setsenha(int senha) {
		this.autenticador.setsenha(senha);

	}
//
//	public boolean autentica(int senha) {
//		boolean autenticou = this.util.autentica(senha);
//		return autenticou;
//	}
	//ou código + enchuto

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha); //o método delega a chamada
	}
}
