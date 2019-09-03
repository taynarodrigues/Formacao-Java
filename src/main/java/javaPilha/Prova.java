package javaPilha;

public class Prova {

	class ConexaoException extends Exception {

		private static final long serialVersionUID = 1L;
	
	}

	class Conexao {
		public void fecha() throws ConexaoException {
		}
	}


	class TesteConexao {
		public void main(String[] args) {

			Conexao con = new Conexao();
			try {
				con.fecha();
			} catch (ConexaoException ex) {
				ex.printStackTrace();
			}

		}
	}
}
