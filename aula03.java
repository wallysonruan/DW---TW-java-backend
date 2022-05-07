package aula03;

import java.util.Scanner;

public class aula03 {
	
	public static void main(String[] args) {
		int repetir = 0;
		
		while (repetir != 1) {			
			Scanner resposta_do_usuário = new Scanner(System.in);
			
			System.out.println("Qual é o seu nome?");
			String nome = resposta_do_usuário.next();
			
			System.out.println("Há quanto tempo você trabalha conosco?\n[DIGITE APENAS NÚMEROS]");
			int período = resposta_do_usuário.nextInt();
			
			System.out.println("Qual é o seu salário atual?");
			int salário_atual = resposta_do_usuário.nextInt();
			
			int aumento_porcentagem = 10;
			int salário_novo = (salário_atual/100)*aumento_porcentagem;
			
			String mensagem;
			
			if (período > 10.0) {
				mensagem = "Quanto tempo " + nome + "! \n Muito bom ter você conosco, por isso gostaríamos de recompensá-lo com um aumento de " + aumento_porcentagem +"%, por isso, de agora em diante, seu salário será: R$" + salário_novo;
			}else {
				mensagem = "Agradecemos por responder a este formulário!";
			}
			
			System.out.println(mensagem);
			
			System.out.println("\n\nGOSTARIA DE REPETIR O PROGRAMA?\n[(0) SIM – (1) NÃO]\n:");
			repetir = resposta_do_usuário.nextInt();
		}
	}
}
