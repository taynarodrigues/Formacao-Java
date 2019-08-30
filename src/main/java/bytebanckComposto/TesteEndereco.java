package bytebanckComposto;

public class TesteEndereco {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(); //instanciou uma pessoa
		p.nome = "Paulo"; //dou nome para ela
		
		p.endereco = new Endereco(); //instanciou um endereco
		p.endereco.logradouro = "Avenida XYZ"; //dou um logradouro
		
		System.out.println(p.endereco.logradouro);
	}
}
