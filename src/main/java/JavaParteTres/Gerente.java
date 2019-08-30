package JavaParteTres;
//Gerente é um FuncionárioAutenticável, herda da class FuncionárioAutenticável

public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() { //reescrita -> a mesma assinatura...
		System.out.println("Chamando o método de bonificacao do gerente");
		return super.getSalario();
		
	}

}
