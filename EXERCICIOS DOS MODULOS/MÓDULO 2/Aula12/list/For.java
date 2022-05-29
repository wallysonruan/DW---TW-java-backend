package list;

import java.util.List;
import java.util.Arrays;

/*
 *FOR: devemos criar uma lista de string com 5 posições 
 *e imprimir elas
*/

public class For {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("a", "b", "c", "d", "e");
		lista.stream().forEach(letra -> {System.out.println(letra);});		
	}

}
