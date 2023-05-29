package Programa5;

public class Calculadora {

  // Método que calcula a média de um conjunto de números.
  // Retorna a média dos números no array.
  public static double media(double[] numeros) {
    double resultado = 0.0;
    for (double numero : numeros) {
      resultado += numero;
    }
    resultado /= numeros.length;
    return resultado;
  }

  // Método que calcula a soma de um conjunto de números.
  // Retorna a soma dos números no array.
  public static double soma(double[] numeros) {
    double resultado = 0.0;
    for (int i = 0; i < numeros.length; i++) {
      resultado += numeros[i];
    }
    return resultado;
  }

  // Método que realiza a soma dos produtos de dois conjuntos de números.
  // Retorna a soma dos produtos dos números nos arrays.

  public static double somaMultiplica(double[] numerosX, double[] numerosY) {
    double resultado = 0.0;
    if (numerosX.length != numerosY.length) {
      throw new IllegalArgumentException("Os arrays devem ter o mesmo tamanho");
    }
    for (int i = 0; i < numerosX.length; i++) {
      resultado += numerosX[i] * numerosY[i];
    }
    return resultado;
  }
}