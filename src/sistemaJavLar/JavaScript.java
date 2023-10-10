package sistemaJavLar;

public class JavaScript extends Planetas {

	public JavaScript(int posicaoX, int posicaoY, int velocidade, String nome, int velocidadeTranslacao,
			int velocidadeRotacao) {
		super(posicaoX, posicaoY, velocidade, nome, velocidadeTranslacao, velocidadeRotacao);
	}


		public void mover(int velocidade, int quantidade) {
			int i;
			for (i = 0; i < velocidade * quantidade; i++) {
				if (posicaoX > 5 && posicaoX <= 11 && posicaoY == 10)
					posicaoX--;
				else if (posicaoY > 5 && posicaoY <= 10 && posicaoX == 5)
					posicaoY--;
				else if (posicaoX >= 5 && posicaoX < 11 && posicaoY == 5)
					posicaoX++;
				else if (posicaoY >= 5 && posicaoY < 10 && posicaoX == 11)
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
