package sistemaJavLar;

public class Celula {
	private int posicaoX;
	private int posicaoY;
	private Entidades coisadentro;

	public Celula(int posicaoX, int posicaoY, Entidades coisadentro) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.coisadentro = coisadentro;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public Entidades getCoisadentro() {
		return coisadentro;
	}

	public void setCoisadentro(Entidades coisadentro) {
		this.coisadentro = coisadentro;
	}

}
