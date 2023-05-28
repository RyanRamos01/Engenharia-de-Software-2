package Programa3;

// Classe para representar um par ordenado.
public class ParOrdenado {

	private ListaEncadeada dados;

	private double somaDosValoresDeX;
	private double mediaDosValoresDeX;

	private double somaDosValoresDeY;
	private double mediaDosValoresDeY;

	private double somaDosValoresQuadradosDeX;
	private double somaDosValoresQuadradosDeY;
	private double somaDosValoresDeXVezesY;

	// Método construtor da classe
	public ParOrdenado() {
		this.dados = new ListaEncadeada();

		this.somaDosValoresDeX = 0.00;
		this.somaDosValoresDeY = 0.00;
		this.mediaDosValoresDeX = 0.00;
		this.mediaDosValoresDeY = 0.00;
		this.somaDosValoresQuadradosDeY = 0.00;
		this.somaDosValoresQuadradosDeX = 0.00;
		this.somaDosValoresDeXVezesY = 0.00;
	}

	// Construtor que recebe arrays de valores de X e Y, adiciona eles aos dados e
	// calcula valores.
	public ParOrdenado(double[] valoresDeX, double[] valoresDeY) {
		this.dados = new ListaEncadeada();
		this.dados.adicionaNo(valoresDeX, valoresDeY);
		this.calcularValores();
	}

	// Método que chama todos os métodos de cálculo.
	public void calcularValores() {
		this.calcularSomaDosValoresDeX();
		this.calcularSomaDosValoresDeY();
		this.calcularMediaDosValoresDeX();
		this.calcularMediaDosValoresDeY();
		this.calcularSomaDosValoresDeXVezesY();
		this.calcularSomaDosValoresQuadradosDeX();
		this.calcularSomaDosValoresQuadradosDeY();
	}

	// Método que calcula a soma dos valores de X.
	public void calcularSomaDosValoresDeX() {
		No no;
		this.somaDosValoresDeX = 0.00;

		for (no = this.dados.getPrimeiroNo(); no != null; no = no.getProximoNo()) {
			this.somaDosValoresDeX += no.getCoordenadaX();
		}
	}

	// Método que calcula a média dos valores de X.
	public void calcularMediaDosValoresDeX() {
		this.mediaDosValoresDeX = this.somaDosValoresDeX / this.getDados().getNumeroDeNos();
	}

	// Método que calcula a soma dos valores de Y.
	public void calcularSomaDosValoresDeY() {
		No no;
		this.somaDosValoresDeY = 0.00;

		for (no = this.dados.getPrimeiroNo(); no != null; no = no.getProximoNo()) {
			this.somaDosValoresDeY += no.getCoordenadaY();
		}
	}

	// Método que calcula a média dos valores de Y.
	public void calcularMediaDosValoresDeY() {
		this.mediaDosValoresDeY = this.somaDosValoresDeY / this.getDados().getNumeroDeNos();
	}

	// Método que calcula a soma dos valores de X vezes Y.
	public void calcularSomaDosValoresDeXVezesY() {
		No no;
		this.somaDosValoresDeXVezesY = 0.00;

		for (no = this.dados.getPrimeiroNo(); no != null; no = no.getProximoNo()) {
			this.somaDosValoresDeXVezesY += (no.getCoordenadaX() * no.getCoordenadaY());
		}
	}

	// Método que calcula a soma dos valores de X ao quadrado.
	public void calcularSomaDosValoresQuadradosDeX() {
		No no;
		this.somaDosValoresQuadradosDeX = 0.00;

		for (no = this.dados.getPrimeiroNo(); no != null; no = no.getProximoNo()) {
			this.somaDosValoresQuadradosDeX += (no.getCoordenadaX() * no.getCoordenadaX());
		}
	}

	// Método que calcula a soma dos valores de Y ao quadrado.
	public void calcularSomaDosValoresQuadradosDeY() {
		No no;
		this.somaDosValoresQuadradosDeY = 0.00;

		for (no = this.dados.getPrimeiroNo(); no != null; no = no.getProximoNo()) {
			this.somaDosValoresQuadradosDeY += (no.getCoordenadaY() * no.getCoordenadaY());
		}
	}

	// Métodos do encapsulamento dos atributos da classe.
	public ListaEncadeada getDados() {
		return dados;
	}

	public double getSomaDosValoresDeX() {
		return somaDosValoresDeX;
	}

	public double getMediaDosValoresDeX() {
		return mediaDosValoresDeX;
	}

	public double getSomaDosValoresDeY() {
		return somaDosValoresDeY;
	}

	public double getMediaDosValoresDeY() {
		return mediaDosValoresDeY;
	}

	public double getSomaDosValoresQuadradosDeX() {
		return somaDosValoresQuadradosDeX;
	}

	public double getSomaDosValoresQuadradosDeY() {
		return somaDosValoresQuadradosDeY;
	}

	public double getSomaDosValoresDeXVezesY() {
		return somaDosValoresDeXVezesY;
	}
}
