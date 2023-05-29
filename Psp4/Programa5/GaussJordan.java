package Programa5;

public class GaussJordan {

  // Método que executa a eliminação de Gauss-Jordan em uma matriz.
  // O método retorna um vetor contendo as soluções da equação representada pela
  // matriz.
  public static double[] gaussiana(double[][] matriz) {
    // Pegando o número de linhas da matriz
    int n = matriz.length;

    // Percorrendo cada linha da matriz
    for (int i = 0; i < n; i++) {
      // Escolhendo o maior pivô na coluna atual
      int max = i;
      for (int j = i + 1; j < n; j++) {
        if (Math.abs(matriz[j][i]) > Math.abs(matriz[max][i]))
          max = j;
      }

      // Trocando as linhas
      double[] t = matriz[i];
      matriz[i] = matriz[max];
      matriz[max] = t;

      // Realizando a eliminação de Gauss para cada linha abaixo da linha atual
      for (int j = i + 1; j < n; j++) {
        double a = matriz[j][i] / matriz[i][i];
        matriz[j][n] -= a * matriz[i][n];
        for (int k = i; k < n; k++)
          matriz[j][k] -= a * matriz[i][k];
      }
    }

    // Calculando a solução do sistema a partir da matriz resultante
    double[] x = new double[n];
    for (int i = n - 1; i >= 0; i--) {
      double soma = 0;
      for (int j = i + 1; j < n; j++)
        soma += matriz[i][j] * x[j];
      x[i] = (matriz[i][n] - soma) / matriz[i][i];
    }

    // Retornando o vetor de soluções
    return x;
  }
}