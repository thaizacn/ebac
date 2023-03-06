
public class PessoasEGenero {
	
	private String nome;
	private String genero;
	
	public PessoasEGenero(String nome, String sexo){
		this.nome = nome;
		this.genero = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "PessoasESexo [nome=" + nome + ", sexo=" + genero + "]";
	}
	
}
