package jogo;

public class Jogador {
	
	public static void main(String[] args) {
		Arma a = new Arma("38", "portátil", "oitão", 7, false, 0.38);
		
		a.status();
		a.atirar();
		a.recarregar();
		a.recarregar();
		a.status();
		a.atirar();
		System.out.printf("\n Atirei %d vezes e recarreguei %d vezes", a.qtdVezesAtirou, a.qtdVezesRecarregou);
	}

}