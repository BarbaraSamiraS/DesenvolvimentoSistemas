import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double xPonto, yPonto, circulo, cilindro;
		
		System.out.println("Qual é o valor do ponto X?");
		xPonto = ler.nextDouble();
		
		System.out.println("Qual é o valor do ponto Y?");
		yPonto = ler.nextDouble();
		
		System.out.println("Qual é o valor do raio do circulo?");
		circulo = ler.nextDouble();
		
		System.out.println("Qual é o valor da altura do cilindro?");
		cilindro = ler.nextDouble();
		
		
		Ponto p = new Ponto (xPonto, yPonto );
		Circulo c = new Circulo(p, circulo);
		Cilindro d = new Cilindro(c, cilindro);

		p.mostrar();
		c.mostrar();
		d.mostrar();
		

	}
}
