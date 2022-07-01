package aula09_02;

public class Motorista {

	public static void main(String[] args) {		
		Caminhao caminhaoComRampa = new Caminhao("Carreta", true);
		Caminhao caminhaoSemRampa = new Caminhao("Truck", false);

		caminhaoComRampa.rampaAbrir();
		caminhaoComRampa.ligar();
		caminhaoComRampa.rampaAbrir();
		caminhaoComRampa.ligar();
	}

}
