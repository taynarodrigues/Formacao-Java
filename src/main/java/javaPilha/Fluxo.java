package javaPilha;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) { 							
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		} 
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		
	
		// criar objeto da classe
		ArithmeticException exception = new ArithmeticException("ERRO");
		//Jogar o objeto
		throw exception;
		
		
//		System.out.println("Fim do metodo2");
	}

}
