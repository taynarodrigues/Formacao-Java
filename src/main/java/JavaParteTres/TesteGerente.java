package JavaParteTres;

public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente2();
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf(222222222-20);
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
//		g1.autentica(123);
		g1.setsenha(123);
		
		boolean autenticou = g1.autentica(123);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
