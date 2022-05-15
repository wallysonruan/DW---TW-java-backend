package whatsapp;

public class Whatsapp {
	private String nomeDeUsuario;
	private String numero;
	private String[] nomeDeUsuarioAlterado = new String[1];
	private String[] telAlterado = new String[1];
	
	//GETTERS
	public String getName() {
		if(nomeDeUsuarioAlterado[0] == null) {
			return nomeDeUsuario;	
		}else {
			return nomeDeUsuarioAlterado[nomeDeUsuarioAlterado.length - 1];
		}
	}
	public String getTel() {
		if(telAlterado[0] == null) {
			return numero;	
		}else {
			return telAlterado[telAlterado.length - 1];
		}
	}
	public void getData() {
		System.out.printf("NOME: %s\nNUMERO: %s\n", getName(), getTel());
	}
	
	//SETTLERS
	public void setName(String nome) {
		this.nomeDeUsuario = nome;
	}
		public void setNewName(String novoNome) {
			if(nomeDeUsuarioAlterado[0] == null) {
				this.nomeDeUsuarioAlterado[0] = novoNome;
			}else {
				this.nomeDeUsuarioAlterado[nomeDeUsuarioAlterado.length - 1] = novoNome;
			}
		}
	
	public void setTel(String numero) {
		this.numero = numero;
	}
		public void setNewTel(String novoNumero) {
			if(telAlterado[0] == null) {
				this.telAlterado[0] = novoNumero;
			}else {
				this.telAlterado[telAlterado.length - 1] = novoNumero;
			}
		}
	
	/**/
	public static void main(String[] args) {
		Whatsapp teste = new Whatsapp();
		teste.getData();
		teste.setName("Ruan");
		teste.setTel("5531987039842");
		teste.setNewName("oi");
		teste.setNewName("aloha");
		teste.setNewTel("asd");
		teste.getData();
	}
}