package aula09_02;

/*
 * classe pai: 5 atributos, 1 método
classe filho: 3 atributos 1 metodo
tambem veiculo

 */

public class Veiculo {
	protected String modelo;
	protected int numeroDeAssentos;
	protected String placas;
	protected boolean automatico;
	protected boolean ligado = false;
	
	public void ligar(boolean ligado) {
		this.ligado = ligado;
	}

}
