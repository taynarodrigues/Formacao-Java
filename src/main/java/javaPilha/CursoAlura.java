package javaPilha;

public class CursoAlura {
	
	public static void main(String[] args) {
		 String nome = "Alura";
		 System.out.println("ANTES");
		 
		 try {
			 System.out.println(nome);
		 }catch(ArrayIndexOutOfBoundsException ex) {
			 System.out.println("CATCH");
		 }
		 System.out.println("DEPOIS");
	}
 //OBS: Nenhum erro acontecerá e por isso a condição catch não será chamada.
}
