package bytebankHerdado;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		/*introdução a exceções*/
		
		//int a = 3;
		//int b = a / 0;
		/*
		 * Ao compilar aparece ERRO NO CONSOLE Exception in thread "main"
		 * java.lang.ArithmeticException: / by zero at
		 * bytebankHerdado.TesteContas.main(TesteContas.java:8)
		 */

		// null significa que essa referência não aponta para nenhum objeto
		//ContaCorrente outra = null;
	//	outra.deposita(200.0);
		/*
		 * Ao compilar aparece -> ERRO NO CONSOLE Exception in thread "main"
		 * java.lang.NullPointerException at
		 * bytebankHerdado.TesteContas.main(TesteContas.java:9)
		 */

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());
	}

}
