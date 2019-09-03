package javaPilha;

//A ideia da interface é imprimir um contrato -> Implementar um método
public class Conexao implements AutoCloseable{
	
	//construtor para abrir a conexao
	public Conexao(){
		System.out.println("abrindo conexao");
		throw new IllegalStateException();
	}
	
	//método para ler dados
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	

	@Override
	public void close(){		
		System.out.println("Fechando conexao");
	}

}
