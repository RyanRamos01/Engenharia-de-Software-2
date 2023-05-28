package Programa4;

// Classe ListaEncadeada
public class ListaEncadeada {
	private No primeiroNo;
	private No ultimoNo;

	// construtor
	public ListaEncadeada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
	}

	// métodos "adicionaNo", alterando seus parametros para se adequar a cada
	// cenário
	public void adicionaNo(No no) {
		if (this.primeiroNo == null) {
			this.primeiroNo = no;
			this.ultimoNo = no;

			this.primeiroNo.setProximoNo(this.ultimoNo);
			this.ultimoNo.setProximoNo(null);

		} else {
			ultimoNo.setProximoNo(no);
			this.ultimoNo = no;
		}
	}

	public void adicionaNo(double dado) {
		No no = new No();
		no.setValorNo(dado);
		adicionaNo(no);
	}

	public void adicionaNo(double[] dado) {
		for (int i = 0; i < dado.length; i++) {
			No no = new No();
			no.setValorNo(dado[i]);
			adicionaNo(no);
		}
	}

	// método removeUltimoNo
	public No removeUltimoNo() {

		No no;

		if (this.primeiroNo == this.ultimoNo) {
			no = this.primeiroNo;

			this.primeiroNo = null;
		} else {
			for (no = this.primeiroNo; no.getProximoNo() != this.ultimoNo; no = no.getProximoNo())
				;

			this.ultimoNo = no;
		}

		return no;
	}

	// Os métodos a seguir são usados para encapsular os atributos da classe

	// método getPrimeiroNo
	public No getPrimeiroNo() {
		return primeiroNo;
	}

	// método setPrimeiroNo
	public void setPrimeiroNo(No primeiroNo) {
		this.primeiroNo = primeiroNo;
	}

	// método getUltimoNo
	public No getUltimoNo() {
		return ultimoNo;
	}

	// método setUltimoNo
	public void setUltimoNo(No ultimoNo) {
		this.ultimoNo = ultimoNo;
	}
}
