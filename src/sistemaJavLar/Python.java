package sistemaJavLar;

public class Python extends Planetas {

	public Python(int posicaoX, int posicaoY, int velocidade, String nome, int velocidadeTranslacao,
			int velocidadeRotacao) {
		super(posicaoX, posicaoY, velocidade, nome, velocidadeTranslacao, velocidadeRotacao);

	}


	public void mover(int velocidade, int quantidade) {
		int i;
		for (i = 0; i < velocidade * quantidade; i++) {
			if (posicaoX > 6 && posicaoX <= 10 && posicaoY == 9)
				posicaoX--;
			else if (posicaoY > 6 && posicaoY <= 9 && posicaoX == 6)
				posicaoY--;
			else if (posicaoX >= 6 && posicaoX < 10 && posicaoY == 6)
				posicaoX++;
			else if (posicaoY >= 6 && posicaoY < 9 && posicaoX == 10)
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
