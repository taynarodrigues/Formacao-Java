package JavaParteTres;
//Contrato Autenticável
	//quem assinar esse contrato, precisa implementar
			//método setsenha
			//método autentica

public abstract interface Autenticavel{

	

	public abstract void setsenha(int senha);
	
	public abstract boolean autentica(int senha);

}
