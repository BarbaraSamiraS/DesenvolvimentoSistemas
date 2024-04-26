
public class Produto {
	private int id;
	private String nome;
	private double preco;
	

	public Produto( int id, String nome, double preco) {
		 this.id = id;
		 this.nome = nome;
		 this.preco = preco;
	}
	
	// get
	int getId () {
		return this.id;
	}
	String getNome () {
		return this.nome;
	}
	double getPreco () {
		return this.preco;
	}
	
	
	// set
	void setNome (String nome) {
		this.nome = this.nome;
	}
	
	void setPreco (double preco) {
		this.preco = this.preco;
	}
	
	//metodo
	
	public double calcularDesconto (double desconto) {
		double num = (preco/100)*desconto;
		double resultado = preco-num;
		return resultado;
	}
	

}
