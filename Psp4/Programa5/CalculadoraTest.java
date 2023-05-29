package Programa5;

import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
  @Test
  public void testCalculadora() {
    double[] x = { 1142, 863, 1065, 554, 983, 256 };
    double[] y = { 1060, 995, 3205, 120, 2896, 485 };
    double[] z = { 325, 98, 23, 0, 120, 88 };
    double[] b = { 201, 98, 162, 54, 138, 61 };

    DecimalFormat formatoDecimal = new DecimalFormat("#.####");
    double[] betas = GaussJordan.gaussiana(new double[][] {
        { b.length, Calculadora.soma(x), Calculadora.soma(y), Calculadora.soma(z), Calculadora.soma(b) },
        { Calculadora.soma(x), Calculadora.somaMultiplica(x, x), Calculadora.somaMultiplica(x, y),
            Calculadora.somaMultiplica(x, z), Calculadora.somaMultiplica(x, b) },
        { Calculadora.soma(y), Calculadora.somaMultiplica(x, y), Calculadora.somaMultiplica(y, y),
            Calculadora.somaMultiplica(y, z), Calculadora.somaMultiplica(y, b) },
        { Calculadora.soma(z), Calculadora.somaMultiplica(x, z), Calculadora.somaMultiplica(y, z),
            Calculadora.somaMultiplica(z, z), Calculadora.somaMultiplica(z, b) }
    });

    // Casos de teste especificados na especificação.
    assertEquals("6,7013", formatoDecimal.format(betas[0]));
    assertEquals("0,0784", formatoDecimal.format(betas[1]));
    assertEquals("0,015", formatoDecimal.format(betas[2]));
    assertEquals("0,2461", formatoDecimal.format(betas[3]));
  }
}