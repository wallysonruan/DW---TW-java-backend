package jogo;

public class Jogador {
	
	public static void compararArmas(String nomeArma1, double tempoArma1, String nomeArma2, double tempoArma2) {
		String armaVencedora = tempoArma1 < tempoArma2 ? nomeArma1 : nomeArma2;
		
		System.out.printf("\n\nA arma %s venceu!", armaVencedora);
	}
	
	public static void main(String[] args) {
		Arma revolver = new Arma("Revólver 38", "Pistola", "oitão", 7, false, 0.38, 0.30);
		Arma taurus = new Arma("Taurus", "pistola", "taurinha", 20, false, 0.30, 0.50);
		
		revolver.status();
		revolver.atirar();
		revolver.recarregar();
		revolver.atirar();
		revolver.status();
		revolver.recarregar();
		
		System.out.printf("\n\nTOTAL DE RECARGAS: %d\nTOTAL DE BALAS ATUAIS:%d", revolver.qtdVezesRecarregou, revolver.qtdAtualBalas);
		
		compararArmas(revolver.nome, revolver.tempoDeRecarga, taurus.nome, taurus.tempoDeRecarga);
	}

}