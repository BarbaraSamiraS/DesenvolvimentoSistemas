
public class Licao1 {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Licao1(String titulo,String autor,int anoPublicacao) {
		 this.titulo = titulo;
		 this.autor = autor;
		 this.anoPublicacao = anoPublicacao;
		 
		 
	}

	public String getTitulo() {
		return titulo;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public String exibirDetalhes () {
		
		
		String mensagem = "Os dados da publicação são: "+titulo+", "+autor+" e "+anoPublicacao+". ";
		
		return mensagem;
	}

	
	
}

