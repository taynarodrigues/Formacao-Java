package bytebanckComposto;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "936.548.826-50";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//associa o cliente Paulo à conta contaDoPaulo
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		
	}

}
