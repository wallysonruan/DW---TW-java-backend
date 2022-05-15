package exercicios;

public class TesteDeClasses {

	public static void main(String[] args) {
	Funcionario Ruan = new Funcionario();
	Ruan.defDados("Ruan", "aux", 1000);
	Ruan.mudarSalario(10);
	Ruan.mudarSalario(20);
	Ruan.mostrarDados();
	}

}