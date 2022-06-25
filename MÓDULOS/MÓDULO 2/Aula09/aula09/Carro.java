package aula09;

public class Carro extends Veiculo{

	String modelo;
	int numeroPassageiros;
	
	public Carro(String modelo, int numeroPassageiros, int roda) {
		this.roda  = roda;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
	}

	@Override
	public void conduzir() {
		System.out.printf("O carro de modelo %s, que comporta %d e tem %d rodas está em andamento", this.modelo, this.numeroPassageiros, this.roda);
		
	}

}
