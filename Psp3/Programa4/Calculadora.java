package Programa4;

// Classe Calculadora
public final class Calculadora {

	// método media
	public static Double media(ListaEncadeada dados) {

		int cont = 0;
		double media = 0.00;
		No no;

		for (no = dados.getPrimeiroNo(); no != null; no = no.getProximoNo()) {
			cont++;
			media += no.getValorNo();
		}

		if (cont > 0)
			media = media / cont;

		return media;

	}

	// método desvioPadrao
	public static Double desvioPadrao(ListaEncadeada dados) {

		Double media = Calculadora.media(dados);
		Double desvioPadrao = 0.00;
		int cont = 0;
		No no;

		if (media == 0.00)
			return 0.00;

		for (no = dados.getPrimeiroNo(); no != null; no = no.getProximoNo()) {
			cont++;
			desvioPadrao = desvioPadrao + Math.pow((no.getValorNo() - media), 2);
		}

		desvioPadrao = desvioPadrao / (cont - 1);

		desvioPadrao = Math.sqrt(desvioPadrao);

		return desvioPadrao;
	}

	// método faixaTamanhoRelativa
	public static FaixaDeTamanho faixaTamanhoRelativa(ListaEncadeada dados) {

		FaixaDeTamanho faixaTamanho = new FaixaDeTamanho();

		// Convertendo todos os elementos da ListaEncadeada para logaritmo natural
		for (No no = dados.getPrimeiroNo(); no != null; no = no.getProximoNo())
			no.setValorNo(Math.log(no.getValorNo()));

		double mediaDosDados = Calculadora.media(dados);
		double desvioPadraoDosDados = Calculadora.desvioPadrao(dados);

		// Calculando as faixas logarítmicas
		faixaTamanho.setMuitoPequenoFaixaTamanho(mediaDosDados - 2 * desvioPadraoDosDados);
		faixaTamanho.setPequenoFaixaTamanho(mediaDosDados - desvioPadraoDosDados);
		faixaTamanho.setMedioFaixaTamanho(mediaDosDados);
		faixaTamanho.setGrandeFaixaTamanho(mediaDosDados + desvioPadraoDosDados);
		faixaTamanho.setMuitoGrandeFaixaTamanho(mediaDosDados + 2 * desvioPadraoDosDados);

		// Convertendo os valores de log natural calculando o anti-logaritmo (e para a
		// potência do valor do log)
		faixaTamanho.setMuitoPequenoFaixaTamanho(Math.pow((Math.E), faixaTamanho.getMuitoPequenoFaixaTamanho()));
		faixaTamanho.setPequenoFaixaTamanho(Math.pow((Math.E), faixaTamanho.getPequenoFaixaTamanho()));
		faixaTamanho.setMedioFaixaTamanho(Math.pow((Math.E), faixaTamanho.getMedioFaixaTamanho()));
		faixaTamanho.setGrandeFaixaTamanho(Math.pow((Math.E), faixaTamanho.getGrandeFaixaTamanho()));
		faixaTamanho.setMuitoGrandeFaixaTamanho(Math.pow((Math.E), faixaTamanho.getMuitoGrandeFaixaTamanho()));

		return faixaTamanho;
	}
}