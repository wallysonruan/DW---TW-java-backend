package aula03;

import java.util.Scanner;

public class aula03 {
	
	public static void main(String[] args) {
		int repetir = 0;
		
		while (repetir != 1) {			
			Scanner usuarioResposta = new Scanner(System.in);
			
			System.out.print("Qual � o seu nome?\n:");
			String nome = usuarioResposta.next();
			
			System.out.print("H� quanto tempo voc� trabalha conosco?\n[DIGITE APENAS N�MEROS]\n:");
			double periodo = usuarioResposta.nextDouble();
			
			System.out.print("Qual � o seu sal�rio atual?\n:");
			double salarioAtual = usuarioResposta.nextDouble();
			
			int porcentagemAumento = 10;
			double salarioNovo = salarioAtual + ((salarioAtual / 100) * porcentagemAumento);
			
			String mensagem;
			
			if (periodo > 10) {
				mensagem = "Quanto tempo " + nome + "!\nMuito bom ter voc� conosco, por isso gostar�amos de recompens�-lo com um aumento de " + porcentagemAumento +"%.\nOu seja, de agora em diante, seu sal�rio ser�: R$" + salarioNovo;
			}else {
				mensagem = "Agradecemos por responder a este formul�rio!";
			}
			
			System.out.print(mensagem + "\n\nGOSTARIA DE REPETIR O PROGRAMA?\n[(0) SIM � (1) N�O]\n:");
			repetir = usuarioResposta.nextInt();
		}
	}
}