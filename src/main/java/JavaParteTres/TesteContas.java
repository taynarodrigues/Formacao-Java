package JavaParteTres;

public class TesteContas {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 23334); //conta nome da referência
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia();
		
		
		System.out.println("o total de contas é: " + Conta.getTotal()); //Conta nome da classe
	}

}
