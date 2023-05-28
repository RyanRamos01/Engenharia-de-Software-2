package Programa4;

// Classe No
public class No {
	private No proximoNo;
	private Double valorNo;

	// Os métodos a seguir são usados para encapsular os atributos desta classe

	// método getProximoNo
	public No getProximoNo() {
		return proximoNo;
	}

	// método setProximoNo
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}

	// método getValorNo
	public Double getValorNo() {
		return valorNo;
	}

	// método setValorNo
	public void setValorNo(Double novoValorNo) {
		this.valorNo = novoValorNo;
	}
}
