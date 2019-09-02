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
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			 int a = i / 0; // código perigoso!!!
			Conta c = null;
			c.deposita();

			/*
			 * Quando tentamos compilar Conta c = null Aparece ERRO NO CONSOLE
			 * 
			 * Exception in thread "main" java.lang.NullPointerException at
			 * javaPilha.Fluxo.metodo2(Fluxo.java:29) at
			 * javaPilha.Fluxo.metodo1(Fluxo.java:19) at javaPilha.Fluxo.main(Fluxo.java:7)
			 */

		}
		System.out.println("Fim do metodo2");
	}

}
