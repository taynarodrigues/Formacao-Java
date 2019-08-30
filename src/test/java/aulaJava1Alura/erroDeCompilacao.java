package aulaJava1Alura;

public class erroDeCompilacao {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;

		while (contador <= 15) {
			total += contador;
			contador++;
			System.out.println(total);
		}
	}

}
