package exerciciosAulaOnline;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

/*FILTER: devemos criar uma lista de string de frutas com 3 posições, deve retornar apenas a fruta abacaxi*/

public class Filter {
	
	public static void main(String[] args) {
		List<String> frutas = Arrays.asList("banana", "maçã", "abacaxi");
		List<String> frutaEscolhida = frutas.stream().filter(fruta -> fruta == "abacaxi").collect(Collectors.toList());
		System.out.println(frutaEscolhida);
	}

}
