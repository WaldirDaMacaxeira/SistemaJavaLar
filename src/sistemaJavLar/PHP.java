package sistemaJavLar;

public class PHP extends Planetas {

	public PHP(int posicaoX, int posicaoY, int velocidade, String nome, int velocidadeTranslacao,
			int velocidadeRotacao) {
		super(posicaoX, posicaoY, velocidade, nome, velocidadeTranslacao, velocidadeRotacao);

	}


	public void mover(int velocidade, int quantidade) {
		int i;
		for (i = 0; i < velocidade * quantidade; i++) {
			if (posicaoX > 3 && posicaoX <= 13 && posicaoY == 12)
				posicaoX--;
			else if (posicaoY > 3 && posicaoY <= 12 && posicaoX == 3)
				posicaoY--;
			else if (posicaoX >= 3 && posicaoX < 13 && posicaoY == 3)
				posicaoX++;
			else if (posicaoY >= 3 && posicaoY < 12 && posicaoX == 13)
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
