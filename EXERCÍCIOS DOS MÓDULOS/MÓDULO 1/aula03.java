package aula03;

import java.util.Scanner;

public class aula03 {
	
	public static void main(String[] args) {
		int repetir = 0;
		
		while (repetir != 1) {			
			Scanner usuarioResposta = new Scanner(System.in);
			
			System.out.print("Qual é o seu nome?\n:");
			String nome = usuarioResposta.next();
			
			System.out.print("Há quanto tempo você trabalha conosco?\n[DIGITE APENAS NÚMEROS]\n:");
			double periodo = usuarioResposta.nextDouble();
			
			System.out.print("Qual é o seu salário atual?\n:");
			double salarioAtual = usuarioResposta.nextDouble();
			
			int porcentagemAumento = 10;
			double salarioNovo = salarioAtual + ((salarioAtual / 100) * porcentagemAumento);
			
			String mensagem;
			
			if (periodo > 10) {
				mensagem = "Quanto tempo " + nome + "!\nMuito bom ter você conosco, por isso gostaríamos de recompensá-lo com um aumento de " + porcentagemAumento +"%.\nOu seja, de agora em diante, seu salário será: R$" + salarioNovo;
			}else {
				mensagem = "Agradecemos por responder a este formulário!";
			}
			
			System.out.print(mensagem + "\n\nGOSTARIA DE REPETIR O PROGRAMA?\n[(0) SIM – (1) NÃO]\n:");
			repetir = usuarioResposta.nextInt();
		}
	}
}