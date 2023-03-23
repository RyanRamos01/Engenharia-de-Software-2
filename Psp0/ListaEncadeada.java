public class ListaEncadeada {

  private NoLista cabeca;

  public ListaEncadeada() {
    this.cabeca = null;
  }

  // Insere um novo número na lista
  public void insere(double numero) {
    NoLista novoNo = new NoLista(numero);
    if (cabeca == null) {
      cabeca = novoNo;
    } else {
      NoLista atual = cabeca;
      while (atual.getProximo() != null) {
        atual = atual.getProximo();
      }
      atual.setProximo(novoNo);
    }
  }

  // Calcula a média dos números na lista
  public double media() {
    if (cabeca == null) {
      return 0;
    }
    NoLista atual = cabeca;
    double soma = 0;
    int contador = 0;
    while (atual != null) {
      soma += atual.getNumero();
      contador++;
      atual = atual.getProximo();
    }
    return (double) soma / contador;
  }

  public double desvioPadrao() {
    if (cabeca == null) {
      return 0;
    }
    NoLista atual = cabeca;
    double soma = 0;
    int contador = 0;
    while (atual != null) {
      soma += atual.getNumero();
      contador++;
      atual = atual.getProximo();
    }
    double media = (double) soma / contador;
    atual = cabeca;
    double somaQuadrados = 0;
    while (atual != null) {
      somaQuadrados += Math.pow(atual.getNumero() - media, 2);
      atual = atual.getProximo();
    }
    return Math.sqrt(somaQuadrados / (contador - 1));
  }

  // Classe interna para representar os nós da lista
  private class NoLista {
    private double numero;
    private NoLista proximo;

    public NoLista(double numero) {
      this.numero = numero;
      this.proximo = null;
    }

    public double getNumero() {
      return numero;
    }

    public NoLista getProximo() {
      return proximo;
    }

    public void setProximo(NoLista proximo) {
      this.proximo = proximo;
    }
  }

  public static void main(String[] args) {
    System.out.println("Tamanho estimado do proxy:");
    ListaEncadeada lista = new ListaEncadeada();
    lista.insere(160);
    lista.insere(591);
    lista.insere(114);
    lista.insere(229);
    lista.insere(230);
    lista.insere(270);
    lista.insere(128);
    lista.insere(1657);
    lista.insere(624);
    lista.insere(1503);
    System.out.println("Média: " + lista.media());
    System.out.println("Desvio padrão: " + lista.desvioPadrao());

    System.out.println();

    System.out.println("Horas de desenvolvimento:");
    ListaEncadeada lista2 = new ListaEncadeada();
    lista2.insere(15.0);
    lista2.insere(69.9);
    lista2.insere(6.5);
    lista2.insere(22.4);
    lista2.insere(28.4);
    lista2.insere(65.9);
    lista2.insere(19.4);
    lista2.insere(198.7);
    lista2.insere(38.8);
    lista2.insere(138.2);
    System.out.println("Média: " + lista2.media());
    System.out.println("Desvio padrão: " + lista2.desvioPadrao());
  }
}
