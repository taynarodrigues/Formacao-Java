package bytebanckCompostoEncapsulado;

public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		Conta conta2 = new Conta(1337, 16549);
		
		Conta conta3 = new Conta(1357, 16549);
		
		System.out.println("O total de contas são: " + Conta.getTotal());
	}

}
