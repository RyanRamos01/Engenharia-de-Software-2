import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContadorLinhas {

    public static void main(String[] args) {
        String nomeArquivo = "ListaEncadeada.java";

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            int totalLinhas = 0;
            String linha = br.readLine();

            // Expressões regulares para identificar classes e métodos
            Pattern padraoClasse = Pattern.compile("^\\s*(public|private|protected)?\\s*class\\s+([A-Za-z0-9_]+)");
            Pattern padraoMetodo = Pattern
                    .compile("^\\s*(public|private|protected)?\\s*([A-Za-z0-9_<>\\[\\]]+)\\s+([A-Za-z0-9_]+)\\s*\\(");

            // Mapas para armazenar o número de linhas por classe e por método
            Map<String, Integer> linhasPorClasse = new HashMap<>();
            Map<String, Integer> linhasPorMetodo = new HashMap<>();
            String nomeClasse = null;
            String nomeMetodo = null;

            while (linha != null) {
                totalLinhas++;

                Matcher matcherClasse = padraoClasse.matcher(linha);
                Matcher matcherMetodo = padraoMetodo.matcher(linha);

                if (matcherClasse.find()) {
                    nomeClasse = matcherClasse.group(2);
                    linhasPorClasse.put(nomeClasse, 1);
                } else if (matcherMetodo.find()) {
                    nomeMetodo = matcherMetodo.group(3);
                    linhasPorMetodo.put(nomeMetodo, 1);
                }

                if (nomeClasse != null) {
                    linhasPorClasse.put(nomeClasse, linhasPorClasse.getOrDefault(nomeClasse, 0) + 1);
                }

                if (nomeMetodo != null) {
                    linhasPorMetodo.put(nomeMetodo, linhasPorMetodo.getOrDefault(nomeMetodo, 0) + 1);
                }

                linha = br.readLine();
            }

            System.out.println("Total de linhas no código: " + totalLinhas);
            System.out.println("Linhas por classe:");

            // printa o total de linhas total de cada classe, método e total do programa.
            for (Map.Entry<String, Integer> entry : linhasPorClasse.entrySet()) {
                System.out.println("Classe " + entry.getKey() + " " + entry.getValue() + " linhas");
            }

            System.out.println("Linhas por método:");

            for (Map.Entry<String, Integer> entry : linhasPorMetodo.entrySet()) {
                System.out.println("Método " + entry.getKey() + " " + entry.getValue() + " linhas");
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}