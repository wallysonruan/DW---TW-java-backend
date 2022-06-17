package exerciciosPlayGround.exercicio4;

import java.util.Map;
import java.util.List;
import java.util.HashMap;


public class GuardaVolumes{
	Integer contador = 0;
	Map<Integer, List<Peca>> roupas = new HashMap<Integer, List<Peca>>();
	
	
	 public Integer guardarPecas(List<Peca> listaDePeca) {
		 this.contador++;
		 roupas.put(contador, listaDePeca);
		 
		 return this.contador;
	 }
	 
	 public void mostrarPecas() {
		 System.out.println("  Nº   |         PEÇAS         ");
		 
		 for(Integer numero: roupas.keySet()) {
			 System.out.printf("   %d   |         %s         ", numero, roupas.get(numero));
		 }
	 }

	 public void mostrarPecas(Integer numero) {
		 System.out.println(this.roupas.get(numero));
	 }

	 public void devolverPecas(Integer numero) {
		 this.roupas.remove(numero);
	 }

	 public static void main(String[] args) {
		 guardarPecas();
	 }
	 
}
