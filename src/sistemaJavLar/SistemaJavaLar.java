package sistemaJavLar;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SistemaJavaLar {
	Plano plano = new Plano();
	public int quantidadeDeBugs;
	public int quantidadeDeDevs;
	public int instante;
	public ArrayList<Bug> listaBugs = new ArrayList<>();
	public ArrayList<Dev> listaDevs = new ArrayList<>();
	public int posicaoX;
	public int posicaoY;
	public int posicaoXBug;
	public int posicaoYBug;
	public int posicaoXDev;
	public int posicaoYDev;
	Scanner leitor = new Scanner(System.in);

	Python python = new Python(8, 9, 4, "Python", instante, instante);
	JavaScript javaScript = new JavaScript(8, 10, 3, "Java Script", posicaoX, instante);
	RubyOnRails rubyOnRails = new RubyOnRails(8, 11, 2, "Ruby On Rails", posicaoX, instante);
	PHP php = new PHP(8, 12, 2, "PHP", instante, instante);
	CSharp cSharp = new CSharp(8, 13, 1, "C#", instante, instante);
	CMaisMais cMaisMais = new CMaisMais(8, 14, 2, "C++", instante, instante);
	C c = new C(8, 15, 10, "C", instante, instante);

	public void menu() {
		System.out.println("Digite o número correspondente ao instante");
		instante = leitor.nextInt();
		System.out.println("Digite a quantidade de Bugs");
		quantidadeDeBugs = leitor.nextInt();
		System.out.println("Digite a quantidade de Devs");
		quantidadeDeDevs = leitor.nextInt();
	}

	public void planoCriacao() {
		for (posicaoX = 0; posicaoX < plano.getComprimento(); posicaoX++) {
			for (posicaoY = 0; posicaoY < plano.getAltura(); posicaoY++) {
				plano.getCelulas()[posicaoX][posicaoY] = new Celula(posicaoX, posicaoY, null);
			}
		}
	}

	public void atribuirPlaneta(Planetas planeta) {
		for (int i = 0; i < plano.getComprimento(); i++) {
			for (int j = 0; j < plano.getAltura(); j++) {
				if (planeta.posicaoY == plano.getCelulas()[i][j].getPosicaoY()
						&& planeta.posicaoX == plano.getCelulas()[i][j].getPosicaoX());
				plano.getCelulas()[posicaoX][posicaoY].setCoisadentro(planeta);
			}
		}
	}

	public void movimentacaoDosPlanetas() {
		python.mover(python.velocidade, this.instante);
		javaScript.mover(python.velocidade, this.instante);
		rubyOnRails.mover(rubyOnRails.velocidade, this.instante);
		php.mover(php.velocidade, this.instante);
		cSharp.mover(cSharp.velocidade, this.instante);
		cMaisMais.mover(cMaisMais.velocidade, this.instante);
		c.mover(c.velocidade, this.instante);
	}

	public void atribuicaoBug() {
		for (int i = 0; i < listaBugs.size(); i++) {
			plano.getCelulas()[posicaoXBug][posicaoYBug].setCoisadentro(listaBugs.get(i));
		}
	}

	public void atribuicaoDev() {
		for (int i = 0; i < listaDevs.size(); i++) {
			plano.getCelulas()[posicaoXDev][posicaoYDev].setCoisadentro(listaDevs.get(i));
		}
	}

	public boolean posicaoVerificarOcupacao(int posicaoX, int posicaoY) {
		for (int i = 0; i < plano.getComprimento(); i++) {
			for (int j = 0; j < plano.getAltura(); j++) {
				if (posicaoY == plano.getCelulas()[i][j].getPosicaoY()
						&& posicaoX == plano.getCelulas()[i][j].getPosicaoX())
					return !(plano.getCelulas()[i][j].getCoisadentro() != null);
			}
		}
		return true;
	}

	public void gerarDevAleatorio() {
		for (int i = 0; i < this.quantidadeDeDevs; i++) {
			posicaoXDev = new Random().nextInt(17);
			posicaoYDev = new Random().nextInt(16);
			if (posicaoVerificarOcupacao(posicaoXDev, posicaoYDev)) {
				listaDevs.add(new Dev(posicaoXDev, posicaoYDev));
			} else
				i--;
		}
	}

	public void gerarBugAleatorio() {
		for (int i = 0; i < this.quantidadeDeBugs; i++) {
			posicaoXBug = new Random().nextInt(17);
			posicaoYBug = new Random().nextInt(16);
			if (posicaoVerificarOcupacao(posicaoXBug, posicaoYBug)) {
				listaBugs.add(new Bug(posicaoXBug, posicaoYBug));
			} else
				i--;
		}
	}

}
