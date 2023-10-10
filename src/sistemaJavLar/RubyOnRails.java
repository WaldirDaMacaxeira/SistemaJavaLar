package sistemaJavLar;

public class RubyOnRails extends Planetas {

	public RubyOnRails(int posicaoX, int posicaoY, int velocidade, String nome, int velocidadeTranslacao,
			int velocidadeRotacao) {
		super(posicaoX, posicaoY, velocidade, nome, velocidadeTranslacao, velocidadeRotacao);

	}


	public void mover(int velocidade, int quantidade) {
			int i;
			for (i = 0; i < velocidade * quantidade; i++) {
				if (posicaoX > 4 && posicaoX <= 12 && posicaoY == 11)
					posicaoX--;
				else if (posicaoY > 4 && posicaoY <= 11 && posicaoX == 4)
					posicaoY--;
				else if (posicaoX >= 4 && posicaoX < 12 && posicaoY == 4)
					posicaoX++;
				else if (posicaoY >= 4 && posicaoY < 11 && posicaoX == 12)
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
