package JavaParteTres;

public class TesteSistema {
	
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setsenha(222);
		
		Administrador adm = new Administrador();
		adm.setsenha(333);
		
		Cliente2 cliente2 = new Cliente2();
		cliente2.setsenha(222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente2);
		
	}
}
