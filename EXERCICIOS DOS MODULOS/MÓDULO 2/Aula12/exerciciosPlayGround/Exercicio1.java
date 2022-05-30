package exerciciosPlayGround;

import java.util.Map;

//Em seguida crie uma classe Exercício 1 com seu método main, imprimir no Main
//todas as chaves junto com seus valores associados. Para isso, utilizar o
//foreach com as chaves.

public class Exercicio1 {

	public static void displayValues(Map<?, ?> collection) {
		for(Object chave: collection.keySet()) {
			Object valor = collection.get(chave);
			System.out.println(chave + ": " + valor);
		}
	}
	
	public static void main(String[] args) {
		LoteriaDosSonhos loteria = new LoteriaDosSonhos();
		Apelidos apelidos = new Apelidos();
		
		System.out.println("LOTERIA:");
		displayValues(loteria.getLoteria());
		
		System.out.println("");
		
		System.out.println("APELIDOS:");
		displayValues(apelidos.getApelidos());
	}
}
