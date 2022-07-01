package exerciciosAulaOnline;

import java.util.List;
import java.util.Arrays;

/*REDUCER: devemos criar uma lista de integer com 3 posições e utilizar o reducer para multiplicar seus valores*/

public class Reducer {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3);
		int total = lista.stream().reduce(1, (multiplicado, proximo) -> multiplicado * proximo);
		System.out.println(total);
	}

}
