package javaPilha;

public class Conexao {
	
	//construtor para abrir a conexao
	public Conexao(){
		System.out.println("abrindo conexao");
	}
	
	//método para ler dados
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	
	public void fecha() {
		System.out.println("Fechando conexao");
	}

}
