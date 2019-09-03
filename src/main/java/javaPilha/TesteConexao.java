package javaPilha;

public class TesteConexao {
	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro no conexao");
		}
		
		
		
		
		
		//---------------------------------------------------------
		//TODA ESSA LINHA ABAIXO SUBSTITUI O CÓDIGO ACIMA
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//			
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu erro no conexao");
//		} finally {
//			System.out.println("Fynally");
//			if(con != null) {
//				con.close();
//			}
//			
//		
//		}
		
	}
}
