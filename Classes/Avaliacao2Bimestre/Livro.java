
public class Livro extends Licao1{
	//Atributos
		private int numeroPaginas;
		private String editora;
		
		public Livro (String titulo,String autor,int anoPublicacao, int numeroPaginas, String editora) {
			super(titulo, autor, anoPublicacao);
			this.numeroPaginas = numeroPaginas;
			this.editora = editora;
		}
		
		//Get e Set
		
		public int getNumeroPaginas() {
			return numeroPaginas;
		}

		public void setNumeroPaginas(int numeroPaginas) {
			this.numeroPaginas = numeroPaginas;
		}

		public String getEditora() {
			return editora;
		}

		public void setEditora(String editora) {
			this.editora = editora;
		}
		
		
		
		//Metodo
		
		@Override
		public String exibirDetalhes() {	
			
				String mensagem = "Os dados da publicação são: "+getTitulo()+", "+getAutor()+", "+getAnoPublicacao()+", "+numeroPaginas+" e "+editora+".";
				return mensagem;
			
		}
		
		public String exibirDetalhes (String pergunta) {	
			
			if(pergunta.equalsIgnoreCase("Sim")) {
				String mensagem = "Os dados da publicação são: "+super.getTitulo()+", "+super.getAutor()+", "+super.getAnoPublicacao()+", "+getNumeroPaginas()+" e "+getEditora()+".";
				return mensagem;
			} else {
				String mensagem = "Os dados da publicação são: "+super.getTitulo()+", "+super.getAutor()+", "+super.getAnoPublicacao()+", "+getNumeroPaginas()+".";
				return mensagem;
			}
			
			
			
			
			
		}

		
}
