package exerciciosAulaOnline;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

/*MAP: devemos criar uma lista string com 4 posições 
 * com valores MAIUSCULOS e utilizar o map para deixar minusculo
 */

public class Map {

	public static void main(String[] args) {
		
		List<String> maiusculas = Arrays.asList("A","B","C","D");
		List<String> minusculas = maiusculas.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(minusculas);
		
		
	}

}
