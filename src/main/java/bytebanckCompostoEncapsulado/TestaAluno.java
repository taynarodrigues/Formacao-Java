package bytebanckCompostoEncapsulado;

public class TestaAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.getNome();
		aluno.setMatricula(110682);
		
		System.out.println(aluno.getMatricula());
	}
}
