package sistemaJavLar;

public class Plano {
	private int altura = 16;
	private int comprimento = 17;
	private Celula[][] celulas = new Celula[comprimento][altura];

	public Celula[][] getCelulas() {
		return celulas;
	}

	public int getAltura() {
		return altura;
	}

	public int getComprimento() {
		return comprimento;
	}

}