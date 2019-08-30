package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta c1 = new Conta();
		System.out.println("O número da agência é: " + c1.agencia);
		System.out.println("O número da conta é: " + c1.numero);
		c1.saldo = 200;
		c1.saldo += 100;
		System.out.println("O saldo da primeira conta é: " + c1.saldo);
	
		Conta c2 = new Conta();
		c2.saldo = 1000;
		System.out.println("O saldo da segunda conta é: " + c2.saldo);
		
		
	}

}
