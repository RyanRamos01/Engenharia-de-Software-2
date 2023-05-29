package Programa5;

import java.text.DecimalFormat;

import Programa5.Calculadora;

public class Main {
  public static void main(String[] args) {
    double[] wi = { 1142, 863, 1065, 554, 983, 256 };
    double[] xi = { 1060, 995, 3205, 120, 2896, 485 };
    double[] yi = { 325, 98, 23, 0, 120, 88 };
    double[] zi = { 201, 98, 162, 54, 138, 61 };

    DecimalFormat formatoDecimal = new DecimalFormat("#.####");
    double[] betas = GaussJordan.gaussiana(new double[][] {
        { zi.length, Calculadora.soma(wi), Calculadora.soma(xi), Calculadora.soma(yi), Calculadora.soma(zi) },
        { Calculadora.soma(wi), Calculadora.somaMultiplica(wi, wi), Calculadora.somaMultiplica(wi, xi),
            Calculadora.somaMultiplica(wi, yi), Calculadora.somaMultiplica(wi, zi) },
        { Calculadora.soma(xi), Calculadora.somaMultiplica(wi, xi), Calculadora.somaMultiplica(xi, xi),
            Calculadora.somaMultiplica(xi, yi), Calculadora.somaMultiplica(xi, zi) },
        { Calculadora.soma(yi), Calculadora.somaMultiplica(wi, yi), Calculadora.somaMultiplica(xi, yi),
            Calculadora.somaMultiplica(yi, yi), Calculadora.somaMultiplica(yi, zi) }
    });
    System.out.println("Beta-0 = " + formatoDecimal.format(betas[0]));
    System.out.println("Beta-1 = " + formatoDecimal.format(betas[1]));
    System.out.println("Beta-2 = " + formatoDecimal.format(betas[2]));
    System.out.println("Beta-3 = " + formatoDecimal.format(betas[3]));
  }
}