package Programa3;

import java.text.DecimalFormat;

public class Main {
	// colunas da tabela
	public static void main(String args[]) {
		double[] tamanhoEstimadoDoProxy = new double[] { 130.00, 650.00, 99.00, 150.00, 128.00, 302.00, 95.00, 945.00,
				368.00, 961.00 };
		double[] tamanhoPlanejado = new double[] { 163.00, 765.00, 141.00, 166.00, 137.00, 355.00, 136.00, 1206.00,
				433.00, 1130.00 };
		double[] tamanhoEfetivo = new double[] { 186.00, 699.00, 132.00, 272.00, 291.00, 331.00, 199.00,
				1890.00, 788.00, 1601.00 };
		double[] tempoEfetivo = new double[] { 15.00, 69.90, 6.50, 22.40, 28.40, 65.90, 19.40, 198.70, 38.80,
				138.20 };

		DecimalFormat formatoDecimal = new DecimalFormat("#.######");

		// casos de teste
		ParOrdenado teste1 = new ParOrdenado(tamanhoEstimadoDoProxy, tamanhoEfetivo);

		System.out.println("Test 1: \n");
		System.out.print("B0: " + formatoDecimal.format(RegrLinear.calcularBeta0(teste1)) + "\t");
		System.out.print("B1: " + formatoDecimal.format(RegrLinear.calcularBeta1(teste1)) + "\t");
		System.out.print("R: " + formatoDecimal.format(RegrLinear.calcularR(teste1)) + "\t");
		System.out.print("R^2: " + formatoDecimal.format(RegrLinear.calcularRSquared(teste1)) + "\t");
		System.out.print(
				"Proxy 386.00: Yk = " + formatoDecimal.format(RegrLinear.calcularPredicao(teste1, 386.00)));

		ParOrdenado teste2 = new ParOrdenado(tamanhoEstimadoDoProxy, tempoEfetivo);

		System.out.println("\n\nTest 2: \n");
		System.out.print("B0: " + formatoDecimal.format(RegrLinear.calcularBeta0(teste2)) + "\t");
		System.out.print("B1: " + formatoDecimal.format(RegrLinear.calcularBeta1(teste2)) + "\t");
		System.out.print("R: " + formatoDecimal.format(RegrLinear.calcularR(teste2)) + "\t");
		System.out.print("R^2: " + formatoDecimal.format(RegrLinear.calcularRSquared(teste2)) + "\t");
		System.out.print(
				"Proxy 386.00: Yk = " + formatoDecimal.format(RegrLinear.calcularPredicao(teste2, 386.00)));

		ParOrdenado teste3 = new ParOrdenado(tamanhoPlanejado, tamanhoEfetivo);

		System.out.println("\n\nTest 3: \n");
		System.out.print("B0: " + formatoDecimal.format(RegrLinear.calcularBeta0(teste3)) + "\t");
		System.out.print("B1: " + formatoDecimal.format(RegrLinear.calcularBeta1(teste3)) + "\t");
		System.out.print("R: " + formatoDecimal.format(RegrLinear.calcularR(teste3)) + "\t");
		System.out.print("R^2: " + formatoDecimal.format(RegrLinear.calcularRSquared(teste3)) + "\t");
		System.out.print(
				"Proxy 386.00: Yk = " + formatoDecimal.format(RegrLinear.calcularPredicao(teste3, 386.00)));

		ParOrdenado teste4 = new ParOrdenado(tamanhoPlanejado, tempoEfetivo);

		System.out.println("\n\nTest 4: \n");
		System.out.print("B0: " + formatoDecimal.format(RegrLinear.calcularBeta0(teste4)) + "\t");
		System.out.print("B1: " + formatoDecimal.format(RegrLinear.calcularBeta1(teste4)) + "\t");
		System.out.print("R: " + formatoDecimal.format(RegrLinear.calcularR(teste4)) + "\t");
		System.out.print("R^2: " + formatoDecimal.format(RegrLinear.calcularRSquared(teste4)) + "\t");
		System.out.print(
				"Proxy 386.00: Yk = " + formatoDecimal.format(RegrLinear.calcularPredicao(teste4, 386.00)));
	}
}