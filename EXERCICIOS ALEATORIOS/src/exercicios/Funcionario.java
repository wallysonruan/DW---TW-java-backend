package exercicios;

public class Funcionario {
	private String nome;
	private String cargo;
	private int salario;
	
	//SETTLERS
	public void defDados(String nome, String cargo, int salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void mudarNome(String novoNome){
		this.nome = novoNome;
	}
	
	public void mudarCargo (String novoCargo){
		this.cargo = novoCargo;
	}
	
	public void mudarSalario(int porcentagem){
		this.salario = this.salario + ((this.salario / 100) * porcentagem);
	}
	//GETTERS
	public void mostrarSalario() {
		System.out.print(this.salario);
	}
	
	public void mostrarDados() {
		System.out.printf("Nome: %s\nCargo: %s\nSalário: %d",this.nome, this.cargo, this.salario);
	}
}
