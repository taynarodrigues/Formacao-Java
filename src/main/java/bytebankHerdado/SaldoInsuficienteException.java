package bytebankHerdado;

//usar herança; Seguir a linha de unchecked; ou seja estender a classe RuntimeException
public class SaldoInsuficienteException extends RuntimeException{

	//construtor
	public SaldoInsuficienteException(String msg) {
		super(msg); //construtor da classe mãe
	}
}
