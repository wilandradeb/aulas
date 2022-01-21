

//Classe mae
public class Correntista {
	
	private static int proxCodigo = 1;

	private int codigo;
	private String nome;
	
	public Correntista(String nome) {
		codigo = getProxCodigo();
		this.nome = nome;
	}
	
	public void exibeIdentificacao() {
		System.out.println("Eu sou um correntista: " + getCodigo() + " - " + getNome());
	}
	
	public static int getProxCodigo() {
		return proxCodigo++;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
