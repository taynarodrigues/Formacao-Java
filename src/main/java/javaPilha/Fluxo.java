package javaPilha;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for(int i =1; i <=5; i++) {
			System.out.println(i);
			
			/*
			 * quando tentamos compilar int a = 1 / 0; /* Aparece ERRO NO CONSOLE Exception
			 * in thread "main" java.lang.ArithmeticException: / by zero at
			 * bytebankHerdado.TesteContas.main(TesteContas.java:8)
			 */
			//RESOLVENDO COM TRY CATCH
			//try-> tentar 
			//catch -> Palavra chave para capturar e pega essa exceção e executa o código
			try {
				int a = i / 0; // código perigoso!!!
			} catch(ArithmeticException ex) {
				System.out.println("ArithmeticException");
			}
			
			
		
		}
		System.out.println("Fim do metodo2");
	}

}
