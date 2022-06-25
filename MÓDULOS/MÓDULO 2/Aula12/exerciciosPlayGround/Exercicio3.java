package exerciciosPlayGround;

import java.util.Set;
import java.util.HashSet;

public class Exercicio3 {
	
	static Set<Integer> notas = new HashSet<Integer>() {{
		add(1);
		add(7);
		add(8);
		add(10);
		add(6);
		add(3);
		add(4);
		add(8);
		add(9);
		add(2);
	}};
	

	public static void somaTotal(Set<Integer> conjuntoDeInteiros) {
		Integer total = 0;
		
		for(Integer nota: conjuntoDeInteiros) {
			total += nota;
		}
	
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		somaTotal(notas);
	}

}
