package jogo;

public class Arma implements Armas{
	protected String tipo;
	protected String nome;
	protected String apelido;
	protected int qtdLimiteBalas;
	protected boolean automatica;
	protected double calibre;
	protected boolean silenciador = false;
	protected int qtdAtualBalas;
	protected int qtdVezesAtirou;
	protected int qtdVezesRecarregou;
	
	public Arma(String nome, String tipo, String apelido, int qtdLimiteBalas, boolean automatica, double calibre) {
		this.nome = nome;
		this.tipo = tipo;
		this.apelido = apelido;
		this.qtdLimiteBalas = qtdLimiteBalas; 
		this.automatica = automatica;
		this.calibre = calibre;
	}
	
	private void alarmeRecarregar() {
		System.out.println("Munição insuficiente!");
	}
	
	@Override
	public void atirar() {
		if(this.qtdAtualBalas == 0) {
			alarmeRecarregar();
		}else {
			this.qtdAtualBalas--;
			this.qtdVezesAtirou++;
		}
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

	@Override
	public void status() {
		System.out.printf("NOME: %s\nTIPO: %s\nQTD. ATUAL DE BALAS: %d", this.nome, this.tipo, this.qtdAtualBalas);
	}

}