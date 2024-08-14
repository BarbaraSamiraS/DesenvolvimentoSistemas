public class Octogono {
	private Ponto vertice;
	private double ladosp ;
	private double altura ;
	private double apo;
	
	public Octogono (Ponto p, double ap, double b, double a) {
		vertice = p;
		apo = ap;
		ladosp  = b;
		altura  = a;
	}
	
	public String forma() {
		double perimetro = 8 * ladosp;
		double area = perimetro * apo /2;
		
		return "Vertice = " + vertice.forma() +
		"\nApotema = "+ apo +
		"\nlados = " + ladosp + 
		"\nAltura = " + altura + 
		"\nPerímetro = " + perimetro + 
		"\nArea do Octogono = " + area+"\n";
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}
