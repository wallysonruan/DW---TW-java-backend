package exerciciosAulaOnline;

import java.util.stream.Stream;
import java.util.Comparator;

/*MIN e MAX:  devemos criar uma lista integer de 3 posições e retornar o valor maximo e minimo da lista
 */

public class MinMax {	

	public static void main(String[] args) {
		int min = Stream.of(1,2,3).min(Comparator.comparing(Integer::valueOf)).get();
		int max = Stream.of(1,2,3).max(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println(min + " " + max);
	}

}
