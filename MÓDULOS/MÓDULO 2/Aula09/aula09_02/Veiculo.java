package aula09_02;

public class Veiculo {
	protected String modelo;
	protected int numeroDeAssentos;
	protected String placas;
	protected boolean automatico;
	protected boolean ligado = false;
	
	public void ligar() {
		if(!this.ligado) {
			this.ligado = true;
		}else {
			System.out.printf("O ve�culo %s j� est� ligado!", this.modelo);
		}
	}

}
