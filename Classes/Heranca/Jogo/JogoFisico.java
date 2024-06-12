
public class JogoFisico extends Jogo{
	private int quantJogadores;
	private double tempoPartida;
	
	public JogoFisico (String nome, double preco, String distribuidora, int quantJogadores,  double tempoPartida) {
		super(nome, preco, distribuidora);
		this.quantJogadores = quantJogadores;
		this.tempoPartida = tempoPartida;
	}
	
	// Get e  Set
	public int getQuantJogadores() {
		return quantJogadores;
	}
	public void setQuantJogadores(int quantJogadores) {
		this.quantJogadores = quantJogadores;
	}
	public double getTempoPartida() {
		return tempoPartida;
	}
	public void setTempoPartida(double tempoPartida) {
		this.tempoPartida = tempoPartida;
	}
	
	
	public String calcularTempoPartida (int quantPartidas) {
		double tempoTotal = this.tempoPartida * quantPartidas;
		String mensagem = "O tempo total da partida � de: " + tempoTotal + " minutos.";
		return mensagem;
	}
	
	@Override
	public String exibirDetalhes() {	
		String mensagem = "Dados:\n Nome: "+getNome()+"\n Pre�o: "+getPreco()+"\n Distribuidora: "+getDistribuidora()+"\n Quantidade de Jogadores: "+getQuantJogadores()+"\n Tempo de Partida: "+getTempoPartida();
		return mensagem;
		
	}
}
