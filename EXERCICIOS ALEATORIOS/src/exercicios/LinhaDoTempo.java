package exercicios;
import java.util.Scanner;

public class LinhaDoTempo {

	public static void linhaDoTempo() {
		String titulo;
	  String[] acontecimentos = new String[100];
	  int[] ano = new int[100];
	  
	  
	  int repetir = 0;
	  int totalRodagens = 0;
	  Scanner inputUsuario = new Scanner(System.in);
	  
	  System.out.print("Crie sua linha do tempo aqui!\n\n");
	  
	  System.out.print("Qual será o nome da sua linha do tempo?\n:");
	  titulo = inputUsuario.nextLine();
	  
	  while(repetir != 1){
	    System.out.print("Qual acontecimento gostaria de registrar?\n:");
	    acontecimentos[totalRodagens] = inputUsuario.nextLine();
	    
	    System.out.print("Em que ano isso aconteceu?\n:");
	    ano[totalRodagens] = inputUsuario.nextInt();
	    
	    System.out.print("\n\nGostaria de registrar mais algum?\n[ (0) SIM  (1) NÃO ]\n\n:");
	    repetir = inputUsuario.nextInt();
	    
	    totalRodagens++;
	   }
	   inputUsuario.close();
	   
	   System.out.println("[LINHA DO TEMPO – "+ titulo + "]\n\n.\n.\n.");
	   
	   for(int i = 0; i < totalRodagens; i++){
	     System.out.println(
	     "._ "+ ano[i] + ": " + acontecimentos[i] + "\n."
	     );
	   }
	}
	
	public static void main(String[] args) {
		linhaDoTempo();
	}

}
