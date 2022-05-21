package aula09_02;

public class Caminhao extends Veiculo{
	private double pesoMaximo;
	private boolean rampaTem;
	private boolean rampaAbrir = false;
	
	
	public Caminhao(String modelo, boolean rampaTem) {
		this.modelo = modelo;
		this.rampaTem = rampaTem;
	}

	public void rampaAbrir() {
		if(this.rampaTem) {
			if(this.rampaAbrir == false){
				System.out.println("A rampa abriu.");
				this.rampaAbrir = true;
			}else {
				System.out.println("A rampa já está aberta.");
			}
		}else{
			System.out.print("Não há rampa para abrir");
		}
	}
}
