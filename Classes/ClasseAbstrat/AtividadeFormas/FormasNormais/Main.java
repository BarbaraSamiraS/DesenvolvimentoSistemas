import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double xPonto, yPonto, altura, base, ladosp, apo;
		int reiniciacao=0 ;
		String pergun;
		
		do{
			
			System.out.println("Deseja saber a area de qual forma?  ( QUADRADO / LOSANGO / TRIANGULO / PENTAGONO / OCTOGONO) ");
			pergun = ler.next();
			
			// Ponto
			System.out.println("Qual é o valor do ponto X?");
			xPonto = ler.nextDouble();
			
			System.out.println("Qual é o valor do ponto Y?");
			yPonto = ler.nextDouble();
			
			Ponto p = new Ponto (xPonto, yPonto );
			
			if(pergun.equalsIgnoreCase("PENTAGONO")) {
				System.out.println("Qual é o valor do lados do Pentagono?");
				ladosp = ler.nextDouble();
				
				System.out.println("Qual é o valor da Apotema do Pentagono?");
				apo = ler.nextDouble();
				
				Pentagono pen = new Pentagono (p,ladosp, apo);
				
				System.out.println("\n>> Pentagono");
				pen.mostrar();
				
			} else if(pergun.equalsIgnoreCase("OCTOGONO")) {
				System.out.println("Qual é o valor do lados do Pentagono?");
				ladosp = ler.nextDouble();
				
				System.out.println("Qual é o valor da Apotema do Pentagono?");
				apo = ler.nextDouble();
				
				System.out.println("Qual é o valor da altura da forma?");
				altura = ler.nextDouble();
				
				Octogono oc = new Octogono (p, ladosp, altura, apo);
				
				System.out.println("\n>> Octogono");
				oc.mostrar();
				
			} else {
				// Largura e Altura
				System.out.println("Qual é o valor da altura da forma?");
				altura = ler.nextDouble();
				
				System.out.println("Qual é o valor da largura da forma?");
				base = ler.nextDouble();
				
				// pergunta
				if(pergun.equalsIgnoreCase("QUADRADO")) {
					Quadrado q = new Quadrado (base, altura);
					
					System.out.println("\n>> Quadrado");
					q.mostrar();
					
				}else if (pergun.equalsIgnoreCase("LOSANGO")) {
					Losango lo = new Losango(p, base, altura);
					
					System.out.println("\n>> Losango");
					lo.mostrar();
					
				}else if (pergun.equalsIgnoreCase("TRIANGULO")) {
					Triangulo c = new Triangulo(p, base, altura);
					
					System.out.println("\n>> Triângulo");
					c.mostrar();
					
				}else if (pergun.equalsIgnoreCase("LOSANGO")) {
					
				}else {
					System.out.println(" Nome invalido da forma! ");
				}
			}
			
			
			System.out.println("Deseja listar outras formas?  (sim - 1 / nao - 2) ");
			reiniciacao = ler.nextInt();
			
		}while(reiniciacao==1);
		
		
		ler.close();
		

	}
}
