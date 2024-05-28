
public class Revista extends Licao1{
	//Atributos
		private int numeroEdicao;
		private String mesPublicacao;
		
		public Revista (String titulo,String autor,int anoPublicacao, int numeroEdicao, String mesPublicacao) {
			super(titulo, autor, anoPublicacao);
			this.numeroEdicao = numeroEdicao;
			this.mesPublicacao = mesPublicacao;
		}
		
		//Get e Set
		
		public int getNumeroEdicao() {
			return numeroEdicao;
		}

		public void setNumeroEdicao(int numeroEdicao) {
			this.numeroEdicao = numeroEdicao;
		}

		public String getMesPublicacao() {
			return mesPublicacao;
		}

		public void setMesPublicacao(String mesPublicacao) {
			this.mesPublicacao = mesPublicacao;
		}
		
		//Metodo
		
		@Override
		public String exibirDetalhes() {	
			
			String mensagem = "Os dados da publicação são: "+getTitulo()+", "+getAutor()+", "+getAnoPublicacao()+", "+numeroEdicao+" e "+mesPublicacao+".";
			return mensagem;
		
	}
		
	public String exibirDetalhes (String pergunta) {	
		
		if(pergunta.equalsIgnoreCase("Sim")) {
			String mensagem = "Os dados da publicação são: "+super.getTitulo()+", "+super.getAutor()+", "+super.getAnoPublicacao()+", "+getNumeroEdicao()+" e "+getMesPublicacao()+".";
			return mensagem;
		} else {
			String mensagem = "Os dados da publicação são: "+super.getTitulo()+", "+super.getAutor()+", "+super.getAnoPublicacao()+", "+getNumeroEdicao()+".";
			return mensagem;
		}
		
		
		
		
		
	}

		

		
}
