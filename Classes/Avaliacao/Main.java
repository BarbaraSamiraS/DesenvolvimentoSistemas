import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id, r=1;
		String nome;
		double preco, desconto;
		
		
		do {
			System.out.println("Escreva o ID do produto: ");
			id = ler.nextInt();
			
			System.out.println("Escreva o NOME do produto: ");
			nome = ler.next();
			
			System.out.println("Escreva o PRECO do produto: ");
			preco = ler.nextDouble();
			
			System.out.println("Escreva o desconto do produto: ");
			desconto = ler.nextDouble();
			
			Produto primeiro = new Produto(id,nome,preco);
			
			
			System.out.println("O nome e "+primeiro.getNome());
			
			System.out.println("Produto 1: ID = "+primeiro.getId()+", Nome = "+primeiro.getNome()+", Preço = "+primeiro.getPreco()+", Preço com Desconto = "+primeiro.calcularDesconto(desconto));
			
			System.out.println("Deseja continuar a execução? (1-para SIM ou 2-para NÃO)");
			r = ler.nextInt();
			
		}while(r==1);
        System.out.println("Execução Concluida!");
		
		

	}
}
