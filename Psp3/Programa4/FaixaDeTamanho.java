package Programa4;

// Classe FaixaDeTamanho
public class FaixaDeTamanho {

	private ListaEncadeada dados;
	private double muitoPequenoFaixaTamanho;
	private double pequenoFaixaTamanho;
	private double medioFaixaTamanho;
	private double grandeFaixaTamanho;
	private double muitoGrandeFaixaTamanho;

	// Os métodos a seguir são usados para encapsular os atributos desta classe

	// método getDados
	public ListaEncadeada getDados() {
		return dados;
	}

	// método setDados
	public void setDados(ListaEncadeada dados) {
		this.dados = dados;
	}

	// método getMuitoPequenoFaixaTamanho
	public double getMuitoPequenoFaixaTamanho() {
		return muitoPequenoFaixaTamanho;
	}

	// método setMuitoPequenoFaixaTamanho
	public void setMuitoPequenoFaixaTamanho(double muitoPequenoFaixaTamanho) {
		this.muitoPequenoFaixaTamanho = muitoPequenoFaixaTamanho;
	}

	// método getPequenoFaixaTamanho
	public double getPequenoFaixaTamanho() {
		return pequenoFaixaTamanho;
	}

	// método setPequenoFaixaTamanho
	public void setPequenoFaixaTamanho(double pequenoFaixaTamanho) {
		this.pequenoFaixaTamanho = pequenoFaixaTamanho;
	}

	// método getMedioFaixaTamanho
	public double getMedioFaixaTamanho() {
		return medioFaixaTamanho;
	}

	// método setMedioFaixaTamanho
	public void setMedioFaixaTamanho(double medioFaixaTamanho) {
		this.medioFaixaTamanho = medioFaixaTamanho;
	}

	// método getGrandeFaixaTamanho
	public double getGrandeFaixaTamanho() {
		return grandeFaixaTamanho;
	}

	// método setGrandeFaixaTamanho
	public void setGrandeFaixaTamanho(double grandeFaixaTamanho) {
		this.grandeFaixaTamanho = grandeFaixaTamanho;
	}

	// método getMuitoGrandeFaixaTamanho
	public double getMuitoGrandeFaixaTamanho() {
		return muitoGrandeFaixaTamanho;
	}

	// método setMuitoGrandeFaixaTamanho
	public void setMuitoGrandeFaixaTamanho(double muitoGrandeFaixaTamanho) {
		this.muitoGrandeFaixaTamanho = muitoGrandeFaixaTamanho;
	}
}
