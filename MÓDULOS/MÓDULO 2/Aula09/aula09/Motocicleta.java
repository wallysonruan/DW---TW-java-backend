package aula09;

public class Motocicleta extends Veiculo {
	
	String marca;
	String cor;
	
	public Motocicleta(int roda, String marca, String cor) {
		this.roda = roda;
		this.marca = marca;
		this.cor = cor;
	}

	@Override
	public void conduzir() {
		System.out.printf("A moto de cor %s, marca %s tem um total de %d rodas.", this.cor, this.marca, this.roda);		
	}

}
