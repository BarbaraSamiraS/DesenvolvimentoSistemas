import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		String nome ;
		int idade;
		double peso;
		double altura;
		
		
		ImcEncap primeira = new ImcEncap();
		
		System.out.println("Qual Ã© o seu nome? ");
		nome = ler.next();
		primeira.setNome(nome);
		
		System.out.println("Qual Ã© a sua altura? ");
		altura = ler.nextDouble();
		primeira.setAltura(altura);
		
		System.out.println("Quantos anos vocÃª tem? ");
		idade = ler.nextInt();
		primeira.setIdade(idade);
		
		
		System.out.println("Qual Ã© o seu peso? ");
		peso = ler.nextDouble();
		primeira.setPeso(peso);
		
		
		
		
		System.out.println(primeira.calcularImc());
		
		ler.close();
		
	}

}
