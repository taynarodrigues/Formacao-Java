package JavaParteTres;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() { 
		System.out.println("chamando o método de bonificacao do Editor de vídeo");
		return super.getBonificacao() + 100;
		
	}

}
