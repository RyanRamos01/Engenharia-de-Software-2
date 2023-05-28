package Programa4;

import java.text.DecimalFormat;

public class Main {
	public static void main(String args[]) {
		DecimalFormat formatoDecimal = new DecimalFormat("#.####");

		ListaEncadeada dadosLocPorMetodo = new ListaEncadeada();

		dadosLocPorMetodo
				.adicionaNo(new double[] { 18.00 / 3.00, 18.00 / 3.00, 25.00 / 3.00, 31.00 / 3.00, 37.00 / 3.00, 82.00 / 5.00,
						82.00 / 4.00, 87.00 / 4.00, 89.00 / 4.00, 230.00 / 10.00, 85.00 / 3.00, 87.00 / 3.00, 558.00 / 10.00 });

		FaixaDeTamanho faixaTamanhoLocPorMetodo = Calculadora.faixaTamanhoRelativa(dadosLocPorMetodo);

		System.out.println("Valores para os dados LOC/Método: ");
		System.out.print("Muito Pequeno: " + formatoDecimal.format(faixaTamanhoLocPorMetodo.getMuitoPequenoFaixaTamanho()));
		System.out.print("\t\tPequeno: " + formatoDecimal.format(faixaTamanhoLocPorMetodo.getPequenoFaixaTamanho()));
		System.out.print("\t\tMédio: " + formatoDecimal.format(faixaTamanhoLocPorMetodo.getMedioFaixaTamanho()));
		System.out.print("\t\tGrande: " + formatoDecimal.format(faixaTamanhoLocPorMetodo.getGrandeFaixaTamanho()));
		System.out
				.print("\t\tMuito Grande: " + formatoDecimal.format(faixaTamanhoLocPorMetodo.getMuitoGrandeFaixaTamanho()));

		ListaEncadeada paginasPorCapitulo = new ListaEncadeada();

		paginasPorCapitulo
				.adicionaNo(new double[] { 7.00, 12.00, 10.00, 12.00, 10.00, 12.00, 12.00, 12.00, 12.00, 8.00, 8.00, 8.00,
						20.00, 14.00, 18.00, 12.00 });

		FaixaDeTamanho faixaTamanhoPaginasPorCapitulo = Calculadora.faixaTamanhoRelativa(paginasPorCapitulo);

		System.out.println("\n\nValores para os dados Pgs/Capítulo: ");
		System.out
				.print("Muito Pequeno: " + formatoDecimal.format(faixaTamanhoPaginasPorCapitulo.getMuitoPequenoFaixaTamanho()));
		System.out.print("\t\tPequeno: " + formatoDecimal.format(faixaTamanhoPaginasPorCapitulo.getPequenoFaixaTamanho()));
		System.out.print("\t\tMédio: " + formatoDecimal.format(faixaTamanhoPaginasPorCapitulo.getMedioFaixaTamanho()));
		System.out.print("\t\tGrande: " + formatoDecimal.format(faixaTamanhoPaginasPorCapitulo.getGrandeFaixaTamanho()));
		System.out.print(
				"\t\tMuito Grande: " + formatoDecimal.format(faixaTamanhoPaginasPorCapitulo.getMuitoGrandeFaixaTamanho()));
	}
}
