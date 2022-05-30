package exerciciosPlayGround;

import java.util.Map;
import java.util.HashMap;

//Criar um dicionário que represente os primeiros 5 números da 
//“Loteria dos Sonhos”, junto com seu significado. 
//Para isso, o dicionário deverá ter como chave Integer e como valor uma String.

public class LoteriaDosSonhos {
	public Map<?,?> getLoteria() {
		Map<Integer, String> loteria = new HashMap<>();
		loteria.put(0, "Ovos");
		loteria.put(1, "Água");
		loteria.put(2, "Escopeta");
		loteria.put(3, "Cavalo");
		loteria.put(4, "Dentista");
		loteria.put(5, "Fogo");
		
		return loteria;
	}
}