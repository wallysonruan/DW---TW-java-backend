package exerciciosPlayGround;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

//Criar um dicionário que represente os apelidos que uso para chamar os
//meus amigos. Para isso, o dicionário deverá ter como chave String e como
//valor uma lista de Strings.

public class Apelidos {
	public Map<?,?> getApelidos() {
		Map<String, List<String>> apelidos = new HashMap<>();
		apelidos.put("João", Arrays.asList("Juan","Fissura","Maromba"));
		apelidos.put("Miguel", Arrays.asList("Night Watch", "Bruce Wayne", "Tampinha"));
		apelidos.put("Maria", Arrays.asList("Wonder Woman","Mary","Marilene"));
		apelidos.put("Lucas", Arrays.asList("Lukinha", "Jorge", "George"));
	
		return apelidos;
	}
}