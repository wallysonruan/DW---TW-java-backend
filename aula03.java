package aula03;

import java.util.Scanner;

public class aula03 {
	
	public static void main(String[] args) {
		int repetir = 0;
		
		while (repetir != 1) {			
			Scanner usuarioResposta = new Scanner(System.in);
			
			System.out.println("Qual é o seu nome?");
			String nome = usuarioResposta.next();
			
			System.out.println("Há quanto tempo você trabalha conosco?\n[DIGITE APENAS NÚMEROS]");
			int periodo = usuarioResposta.nextInt();
			
			System.out.println("Qual é o seu salário atual?");
			int salarioAtual = usuarioResposta.nextInt();
			
			int porcentagemAumento = 10;
			int salarioNovo = (salarioAtual/100)*porcentagemAumento;
			
			String mensagem;
			
			if (periodo > 10.0) {
				mensagem = "Quanto tempo " + nome + "! \n Muito bom ter você conosco, por isso gostaríamos de recompensá-lo com um aumento de " + porcentagemAumento +"%, por isso, de agora em diante, seu salário será: R$" + salarioNovo;
			}else {
				mensagem = "Agradecemos por responder a este formulário!";
			}
			
			System.out.println(mensagem);
			
			System.out.println("\n\nGOSTARIA DE REPETIR O PROGRAMA?\n[(0) SIM – (1) NÃO]\n:");
			repetir = usuarioResposta.nextInt();
		}
	}
}
