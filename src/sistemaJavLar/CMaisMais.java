package sistemaJavLar;

public class CMaisMais extends Planetas {

	public CMaisMais(int posicaoX, int posicaoY, int velocidade, String nome, int velocidadeTranslacao,
			int velocidadeRotacao) {
		super(posicaoX, posicaoY, velocidade, nome, velocidadeTranslacao, velocidadeRotacao);
	}

	public void mover(int velocidade, int quantidade) {
		int i;
		for (i = 0; i < velocidade; i++) {
			if (posicaoX > 1 && posicaoX <= 15 && posicaoY == 14)
				posicaoX--;
			else if (posicaoY > 1 && posicaoY <= 14 && posicaoX == 1)
				posicaoY--;
			else if (posicaoX >= 1 && posicaoX < 15 && posicaoY == 1)
				posicaoX++;
			else if (posicaoY >= 1 && posicaoY < 14 && posicaoX == 15)
				posicaoY++;
		}
	}


	public int contarDias(int quantidade) {
	
		return 0;
	}


	public int verificarTranslacao() {
	
		return 0;
	}

}
