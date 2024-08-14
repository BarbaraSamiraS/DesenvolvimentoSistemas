
public class Losango {
	private Ponto vertice;
	private double largura;
	private double altura;
	public Losango (Ponto p, double b, double a) {
		vertice = p;
		largura = b;
		altura = a;
	}
	
	public String forma() {
		double area = largura * altura/2;
		return "Vertice = " + vertice.forma() +
				"\nAltura = " + altura + 
				"\nLargura = " + largura +
				"\nArea do Losango = " + area+"\n";
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}
