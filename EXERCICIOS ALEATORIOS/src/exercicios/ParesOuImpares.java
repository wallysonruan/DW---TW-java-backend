package exercicios;
import java.util.Scanner;

public class ParesOuImpares {

	public static void ParesOuImpares (int tipo, int valor1, int valor2){
		// tipo = 1 : Ímpar; tipo = 2: par.
		switch(tipo) {
		case 0:
			for (int i = 0; i < valor2; i++){
		        if (i % 2 == 0){
		          System.out.println(i);
		        }
		    }
			break;
		case 1:
			for (int i = 0; i < valor2; i++){
		        if (i % 2 > 0){
		          System.out.println(i);
		        }
		    }
		}
	}

	    public static void main(String[] args) {
	    
	      Scanner usuarioResposta = new Scanner(System.in);
	      
	      System.out.print("Escolha o número inicial:\n");
	      int numInicial = usuarioResposta.nextInt();
	      
	      System.out.print("Escolha o número final:\n");
	      int numFinal = usuarioResposta.nextInt();
	      
	      System.out.print("Quais números gostaria de obter?\n [ 0 ] Pares  [ 1 ] Ímpares:\n\n:");
	      int numTipo = usuarioResposta.nextInt();
	      
	      usuarioResposta.close();
	      
	      ParesOuImpares(numTipo, numInicial, numFinal);
	     
	    }
}
