package sistemaJavLar;

public class CSharp extends Planetas {

	public CSharp(int posicaoX, int posicaoY, int velocidade, String nome, int velocidadeTranslacao,
			int velocidadeRotacao) {
		super(posicaoX, posicaoY, velocidade, nome, velocidadeTranslacao, velocidadeRotacao);

	}

	public void mover(int velocidade, int quantidade) {
		int i;
		for (i = 0; i < velocidade * quantidade; i++) {
			if (posicaoX > 2 && posicaoX <= 14 && posicaoY == 13)
				posicaoX--;
			else if (posicaoY > 2 && posicaoY <= 13 && posicaoX == 2)
				posicaoY--;
			else if (posicaoX >= 2 && posicaoX < 14 && posicaoY == 2)
				posicaoX++;
			else if (posicaoY >= 2 && posicaoY < 13 && posicaoX == 14)
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
