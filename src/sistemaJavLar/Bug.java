package sistemaJavLar;

public class Bug extends Entidades {
	private int alteradorDeVelocidade=-1;
	
	public Bug(int posicaoX, int posicaoY) {
		super(posicaoX, posicaoY);
	}

	public int getAlteradorDeVelocidadeBug() {
		return alteradorDeVelocidade;
	}
	
	
}

