package sistemaJavLar;

public abstract class Planetas extends Entidades {
	protected int velocidade;
	protected String nome;
	protected int velocidadeTranslacao;
	protected int velocidadeRotacao;
	
	public Planetas(int posicaoX, int posicaoY, int velocidade, String nome, int velocidadeTranslacao, int velocidadeRotacao) {
		super(posicaoX, posicaoY);
		this.velocidade = velocidade;
		this.nome = nome;
		this.velocidadeTranslacao = velocidadeTranslacao;
		this.velocidadeRotacao = velocidadeRotacao;
	}


}
