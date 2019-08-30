package bytebanckComposto;

public class Banco {
	public static void main(String[] args) {
		Cliente clientePrivado = new Cliente();
		clientePrivado.nome = "Jose";
		clientePrivado.cpf = "12312312312";
		clientePrivado.idade = 49;
		
		System.out.println(clientePrivado.cpf);
		System.out.println(clientePrivado.nome);
		System.out.println(clientePrivado.idade);
	}

}
