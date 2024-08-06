public class Ponto extends FormaGeomatrica {
	private double coordx;
	private double coordy;
	public Ponto (double x, double y) {
		coordx = x;
		coordy = y;
	}
	public String forma() {
		return "Ponto: (" + coordx + ", " + 11 + coordy + ")";
	}
}