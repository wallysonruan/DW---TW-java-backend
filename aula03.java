package aula03;

import java.util.Scanner;

public class aula03 {
	
	public static void main(String[] args) {
		int repetir = 0;
		
		while (repetir != 1) {			
			Scanner resposta_do_usu�rio = new Scanner(System.in);
			
			System.out.println("Qual � o seu nome?");
			String nome = resposta_do_usu�rio.next();
			
			System.out.println("H� quanto tempo voc� trabalha conosco?\n[DIGITE APENAS N�MEROS]");
			int per�odo = resposta_do_usu�rio.nextInt();
			
			System.out.println("Qual � o seu sal�rio atual?");
			int sal�rio_atual = resposta_do_usu�rio.nextInt();
			
			int aumento_porcentagem = 10;
			int sal�rio_novo = (sal�rio_atual/100)*aumento_porcentagem;
			
			String mensagem;
			
			if (per�odo > 10.0) {
				mensagem = "Quanto tempo " + nome + "! \n Muito bom ter voc� conosco, por isso gostar�amos de recompens�-lo com um aumento de " + aumento_porcentagem +"%, por isso, de agora em diante, seu sal�rio ser�: R$" + sal�rio_novo;
			}else {
				mensagem = "Agradecemos por responder a este formul�rio!";
			}
			
			System.out.println(mensagem);
			
			System.out.println("\n\nGOSTARIA DE REPETIR O PROGRAMA?\n[(0) SIM � (1) N�O]\n:");
			repetir = resposta_do_usu�rio.nextInt();
		}
	}
}
