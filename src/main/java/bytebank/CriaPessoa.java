package bytebank;

public class CriaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.nome = "Jonny";
		p.idade = 11;
		System.out.println("" + p.nome);
		System.out.println("" + p.idade);
		
		Pessoa heroi = new Pessoa();
		heroi.nome = "Tayna";
		System.out.println(heroi.nome);
	}

}
