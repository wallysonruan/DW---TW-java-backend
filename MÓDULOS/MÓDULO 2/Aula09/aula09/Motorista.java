package aula09;

public class Motorista {

	public static void main(String[] args) {
		Motocicleta fazer = new Motocicleta(2,"vermelha", "yamaha");
		fazer.conduzir();
		
		Carro jipe = new Carro("Jipe", 4, 4);
		jipe.conduzir();
		
	}

}
