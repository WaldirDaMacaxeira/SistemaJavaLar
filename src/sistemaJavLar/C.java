package sistemaJavLar;

public class C extends Planetas {

	public C(int posicaoX, int posicaoY, int velocidade, String nome, int velocidadeTranslacao, int velocidadeRotacao) {
		super(posicaoX, posicaoY, velocidade, nome, velocidadeTranslacao, velocidadeRotacao);
	}

	public void mover(int velocidade, int quantidade) {
			int i;
			for (i = 0; i < velocidade * quantidade; i++) {
				if (posicaoX > 0 && posicaoX <= 16 && posicaoY == 15)
					posicaoX--;
				else if (posicaoY > 0 && posicaoY <= 15 && posicaoX == 0)
					posicaoY--;
				else if (posicaoX >= 0 && posicaoX < 16 && posicaoY == 0)
					posicaoX++;
				else if (posicaoY >= 0 && posicaoY < 15 && posicaoX == 16)
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
