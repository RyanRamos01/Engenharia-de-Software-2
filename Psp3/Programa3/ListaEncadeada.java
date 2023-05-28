package Programa3;

// A classe ListaEncadeada representa uma lista ligada que satisfaz os requisitos do programa
public class ListaEncadeada {
	// Primeiro nó da lista ligada
	private No primeiroNo;

	// Último nó da lista ligada
	private No ultimoNo;

	// Número de nós na lista ligada
	private int numeroDeNos;

	// Construtor para inicializar uma lista ligada vazia
	public ListaEncadeada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.numeroDeNos = 0;
	}

	// Método para adicionar um nó à lista ligada
	public void adicionaNo(No no) {
		// Incrementa o contador do número de nós
		this.numeroDeNos += 1;

		// Se a lista ligada estiver vazia, o primeiro e o último nó são o nó atual
		if (this.primeiroNo == null) {
			this.primeiroNo = no;
			this.ultimoNo = no;

			// Fazendo o próximo nó do primeiro nó como o último nó e o próximo do último nó
			// como null
			this.primeiroNo.setProximoNo(this.ultimoNo);
			this.ultimoNo.setProximoNo(null);

		} else {
			// Se a lista ligada não estiver vazia, adicione o nó ao final da lista e
			// atualize o último nó
			ultimoNo.setProximoNo(no);
			this.ultimoNo = no;
		}
	}

	// Método para adicionar um nó à lista ligada com valores x e y
	public void adicionaNo(double valorX, double valorY) {
		// Criando um novo nó com os valores x e y fornecidos
		No no = new No();
		no.setCoordenadaX(valorX);
		no.setCoordenadaY(valorY);

		// Adicionando o nó à lista ligada
		adicionaNo(no);
	}

	// Método para adicionar vários nós à lista ligada com arrays de valores x e y
	public void adicionaNo(double[] valoresX, double[] valoresY) {
		// Certifique-se de que os arrays de x e y têm o mesmo tamanho
		if (!(valoresX.length == valoresY.length))
			return;

		// Para cada par de valores x e y, crie um novo nó e adicione à lista ligada
		for (int i = 0; i < valoresX.length; i++) {
			No no = new No();
			no.setCoordenadaX(valoresX[i]);
			no.setCoordenadaY(valoresY[i]);
			adicionaNo(no);
		}
	}

	// Método para remover o último nó da lista ligada
	public No removeUltimoNo() {
		No no;

		// Se a lista ligada tiver apenas um nó, remova-o
		if (this.primeiroNo == this.ultimoNo) {
			no = this.primeiroNo;
			this.primeiroNo = null;
		} else {
			// Se a lista ligada tiver mais de um nó, percorra até o penúltimo nó
			for (no = this.primeiroNo; no.getProximoNo() != this.ultimoNo; no = no.getProximoNo())
				;

			// Faça o penúltimo nó como o último nó
			this.ultimoNo = no;
		}

		// Decrementa o contador do número de nós
		this.numeroDeNos -= 1;

		// Retorna o nó removido
		return no;
	}

	// Método getter para o primeiro nó
	public No getPrimeiroNo() {
		return primeiroNo;
	}

	// Método setter para o primeiro nó
	public void setPrimeiroNo(No primeiroNo) {
		this.primeiroNo = primeiroNo;
	}

	// Método getter para o último nó
	public No getUltimoNo() {
		return ultimoNo;
	}

	// Método setter para o último nó
	public void setUltimoNo(No ultimoNo) {
		this.ultimoNo = ultimoNo;
	}

	// Método getter para o número de nós
	public int getNumeroDeNos() {
		return numeroDeNos;
	}
}