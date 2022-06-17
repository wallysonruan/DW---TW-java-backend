package exerciciosPlayGround;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Exercicio2 {
	
	protected static List<Integer> numbersList = new ArrayList<Integer>() {{
		add(1);
		add(5);
		add(5);
		add(6);
		add(7);
		add(8);
		add(8);
		add(8);
	}};
	
	protected static Map<Integer, Integer> numbersCollection = new HashMap<Integer, Integer>(){{
		put(1, 1);
		put(2, 5);
		put(3, 5);
		put(4, 6);
		put(5, 7);
		put(6, 8);
		put(7, 8);
		put(8, 8);
	}};
	
	public static void displayList(List<Integer> list) {
		for(Integer element: list) {
			System.out.println(element);
		}
	}
	
	public static void displayCollection(Map<Integer,Integer> collection) {
		for(Integer chave: collection.keySet()) {
			System.out.println(chave + ": " + collection.get(chave));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("\nLISTA:");
		displayList(numbersList);
		System.out.println("\nCOLEÇÃO:");
		displayCollection(numbersCollection);
		System.out.println("\nA diferença entre os exercícios é que a lista fornece indexadores para a localização de cada item – ou seja, ordena-os. O conjunto, na criação, exige que seja declarado o tipo da chave que deverá ser informada a cada inserção de itens.\nAs chaves assumem o papel de indexadores, e permitem que o conjunto seja desordenado.");

	}

}
