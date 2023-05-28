package Programa3;

// Classe que executa os cálculos de regressão linear.
public class RegrLinear {

	// Método para calcular o coeficiente de regressão beta0.
	public static double calcularBeta0(ParOrdenado parOrdenado) {
		// Calcula beta1 utilizando o método calcularBeta1 da classe.
		double beta1 = RegrLinear.calcularBeta1(parOrdenado);

		// Calcula e retorna beta0 com base na fórmula da regressão linear.
		double beta0 = parOrdenado.getMediaDosValoresDeY() - (beta1 * parOrdenado.getMediaDosValoresDeX());

		return beta0;
	}

	// Método para calcular o coeficiente de regressão beta1.
	public static double calcularBeta1(ParOrdenado parOrdenado) {
		double b1;
		int numeroDeValores = parOrdenado.getDados().getNumeroDeNos();

		// Calcula o numerador da fórmula de beta1.
		b1 = parOrdenado.getSomaDosValoresDeXVezesY() -
				(numeroDeValores * parOrdenado.getMediaDosValoresDeX() * parOrdenado.getMediaDosValoresDeY());

		// Calcula o denominador da fórmula de beta1.
		b1 = b1 / (parOrdenado.getSomaDosValoresQuadradosDeX() -
				(numeroDeValores * Math.pow(parOrdenado.getMediaDosValoresDeX(), 2)));

		return b1;
	}

	// Método para calcular o coeficiente de correlação r.
	public static double calcularR(ParOrdenado parOrdenado) {
		double rVal, rNumerador, rDenominador;
		int numeroDeValores = parOrdenado.getDados().getNumeroDeNos();

		// Calcula o numerador da fórmula de r.
		rNumerador = (numeroDeValores * parOrdenado.getSomaDosValoresDeXVezesY());
		rNumerador = rNumerador - (parOrdenado.getSomaDosValoresDeX() * parOrdenado.getSomaDosValoresDeY());

		// Calcula o denominador da fórmula de r.
		rDenominador = (numeroDeValores * parOrdenado.getSomaDosValoresQuadradosDeX());
		rDenominador = rDenominador - (Math.pow(parOrdenado.getSomaDosValoresDeX(), 2));
		rDenominador = rDenominador *
				((numeroDeValores * parOrdenado.getSomaDosValoresQuadradosDeY()) -
						(Math.pow(parOrdenado.getSomaDosValoresDeY(), 2)));
		rDenominador = Math.sqrt(rDenominador);

		// Calcula e retorna r.
		rVal = rNumerador / rDenominador;

		return rVal;
	}

	// Método para calcular o quadrado do coeficiente de correlação r.
	public static double calcularRSquared(ParOrdenado parOrdenado) {
		// Calcula r utilizando o método calcularR da classe.
		double rVal = RegrLinear.calcularR(parOrdenado);

		// Retorna o quadrado de r.
		return rVal * rVal;
	}

	// Método para calcular a previsão melhorada yk para uma estimativa de proxy Xk.
	public static double calcularPredicao(ParOrdenado parOrdenado, double estimativaProxy) {
		// Calcula yk utilizando a fórmula da regressão linear.
		double valorYK = RegrLinear.calcularBeta0(parOrdenado) +
				(RegrLinear.calcularBeta1(parOrdenado) * estimativaProxy);

		return valorYK;
	}
}
