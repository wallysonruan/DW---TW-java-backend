package aula09_02;

public class Motorista {

	public static void main(String[] args) {		
		Caminhao caminhaoComRampa = new Caminhao("Carreta", true);
		Caminhao caminhaoSemRampa = new Caminhao("Truck", false);

		caminhaoComRampa.ligar(true);		
		System.out.println("");
		
		caminhaoComRampa.rampaAbrir();
		caminhaoComRampa.rampaAbrir();
		
		System.out.println("");
		caminhaoSemRampa.rampaAbrir();
		
		caminhaoComRampa.ligar(false);		
		System.out.println("");
		caminhaoComRampa.rampaAbrir();
	}

}
