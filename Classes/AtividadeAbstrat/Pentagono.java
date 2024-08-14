public class Pentagono {
	private Ponto vertice;
	private double ladosp ;
	private double apo;
	
	public Pentagono (Ponto p, double ap, double l) {
		vertice = p;
		apo = ap;
		ladosp  = l;
	}
	
	public String forma() {
		double perimetro = 5 * ladosp;
		double area = perimetro * apo /2;
		
		return "Vertice = " + vertice.forma() +
		"\nApotema = "+ apo +
		"\nlados perímetro = " + ladosp + 
		"\nArea do Pentagono = " + area+"\n";
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}