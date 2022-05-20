package jogo;

public class Arma implements Armas{
	private String tipo;
	private String apelido;
	private int qtdLimiteBalas;
	private int qtdAtualBalas;
	private int qtdVezesAtirou;
	private int qtdVezesRecarregou;
	private boolean silenciador;
	
	public Arma() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atirar() {
		this.qtdAtualBalas--;
		this.qtdVezesAtirou++;
	}

	@Override
	public void recarregar() {
		this.qtdAtualBalas = this.qtdLimiteBalas;
		this.qtdVezesRecarregou++;
	}

	@Override
	public void silenciar() {
		this.silenciador = (this.silenciador ? false : true);
	}

}