package exerciciosPlayGround;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Em seguida crie uma classe Exercício 1 com seu método main, imprimir no Main
//todas as chaves junto com seus valores associados. Para isso, utilizar o
//foreach com as chaves.

public class Exercicio1 {
	
	public static Map<String, List<String>> apelidos = new HashMap<String, List<String>>(){{
		put("João", Arrays.asList("Juan","Fissura","Maromba"));
		put("Miguel", Arrays.asList("Night Watch", "Bruce Wayne", "Tampinha"));
		put("Maria", Arrays.asList("Wonder Woman","Mary","Marilene"));
		put("Lucas", Arrays.asList("Lukinha", "Jorge", "George"));
		}};

	public static Map<Integer, String> loteria = new HashMap<Integer, String>(){{			
		put(0, "Ovos");
		put(1, "Água");
		put(2, "Escopeta");
		put(3, "Cavalo");
		put(4, "Dentista");
		put(5, "Fogo");
	}};

	public static void displayValues(Map<?,?> collection) {
		for(Object chave: collection.keySet()) {
			System.out.println(chave + ": " + collection.get(chave));
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println("LOTERIA:");
		displayValues(loteria);
		
		System.out.println("");
		
		System.out.println("APELIDOS:");
		displayValues(apelidos);
	}
}
