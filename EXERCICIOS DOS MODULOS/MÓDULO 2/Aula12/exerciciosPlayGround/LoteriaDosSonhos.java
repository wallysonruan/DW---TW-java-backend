package exerciciosPlayGround;

import java.util.Map;
import java.util.HashMap;

//Criar um dicion�rio que represente os primeiros 5 n�meros da 
//�Loteria dos Sonhos�, junto com seu significado. 
//Para isso, o dicion�rio dever� ter como chave Integer e como valor uma String.

public class LoteriaDosSonhos {
	public Map<?,?> getLoteria() {
		Map<Integer, String> loteria = new HashMap<>();
		loteria.put(0, "Ovos");
		loteria.put(1, "�gua");
		loteria.put(2, "Escopeta");
		loteria.put(3, "Cavalo");
		loteria.put(4, "Dentista");
		loteria.put(5, "Fogo");
		
		return loteria;
	}
}