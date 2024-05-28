import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		String titulo, autor, pergunta, t;
		int anoPublicacao;
		
		
			System.out.println("Qual é o titulo da Publicação?");
			titulo = ler.next();
			
			System.out.println("Quem é o autor da Publicação?");
			autor = ler.next();
			
			System.out.println("Qual é o ano da Publicação?");
			anoPublicacao = ler.nextInt();
			
			
			Licao1 publicacao = new Licao1(titulo, autor, anoPublicacao);
			
			System.out.println("Deseja ver as informações de qual tipo de Publicação ");
			pergunta = ler.next();
			
			if(pergunta.equalsIgnoreCase("Livro")) {
				int numeroPaginas;
				String editora;
				
				System.out.println("Qual é o numero de paginas?");
				numeroPaginas = ler.nextInt();
				
				System.out.println("Qual é a editora?");
				editora = ler.next();
				
				System.out.println("Deseja incluir a Editora ?");
				t = ler.next();
				
				Livro livro = new Livro(titulo, autor, anoPublicacao, numeroPaginas, editora);
				System.out.println(livro.exibirDetalhes(t)+"\n ");
				
				
			}else if(pergunta.equalsIgnoreCase("Revista")) {
				int numeroEdicao;
				String mesPublicacao;
				
				System.out.println("Qual é o numero de edição?");
				numeroEdicao = ler.nextInt();
				
				System.out.println("Qual é o mes de Publicação?");
				mesPublicacao = ler.next();
				
				System.out.println("Deseja incluir o mes de Publicação ?");
				t = ler.next();
				
				Livro livro = new Livro(titulo, autor, anoPublicacao, numeroEdicao, mesPublicacao);
				System.out.println(livro.exibirDetalhes(t)+"\n ");
				
				
			}else {	
				System.out.println("Somente responda Livro ou Revista");
			}
			
			
				
    
		ler.close();
	}	
}
