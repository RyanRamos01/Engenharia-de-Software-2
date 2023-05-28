package Programa3;

public class No {
	private No proximoNo;
	private Double coordenadaX;
	private Double coordenadaY;

	// Obtém o próximo nó na lista encadeada
	public No getProximoNo() {
		return proximoNo;
	}

	// Define o próximo nó na lista encadeada
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}

	// Obtém o valor da coordenada X
	public Double getCoordenadaX() {
		return coordenadaX;
	}

	// Define o valor da coordenada X
	public void setCoordenadaX(Double coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	// Obtém o valor da coordenada Y
	public Double getCoordenadaY() {
		return coordenadaY;
	}

	// Define o valor da coordenada Y
	public void setCoordenadaY(Double coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
}