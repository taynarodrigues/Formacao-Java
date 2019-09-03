package javaPilha;

public class TesteConexao {
	public static void main(String[] args) {
		
		//declarar uma variável
		Conexao con = null;
		
		try {
			con = new Conexao();
			con.leDados();
			
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
			//finally ->Bloco opcional, e sempre será escutado com ou sem erro
		}finally {
			con.fecha();
		}
		
	}
}
