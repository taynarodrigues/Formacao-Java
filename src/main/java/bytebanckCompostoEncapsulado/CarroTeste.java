package bytebanckCompostoEncapsulado;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro(2013, "Gol", 35000.0);
		carro.setAno(2013);
		carro.setModelo("Gol");
		carro.setPreco(35000.0);
		
		Carro outroCarro = new Carro("Civic", 95000.0);
		
		System.out.println(carro.getModelo());
		System.out.println(carro.getAno());
		System.out.println(carro.getPreco());
		System.out.println(outroCarro.getModelo());
		System.out.println(outroCarro.getAno());
		System.out.println(outroCarro.getPreco());
	}

}
