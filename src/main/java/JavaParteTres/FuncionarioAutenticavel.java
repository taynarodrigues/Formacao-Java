package JavaParteTres;

public class FuncionarioAutenticavel extends Funcionario {
	
	private int senha;

    public void setSenha(int Senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
