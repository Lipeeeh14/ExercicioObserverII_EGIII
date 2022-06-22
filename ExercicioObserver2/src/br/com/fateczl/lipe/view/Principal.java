package br.com.fateczl.lipe.view;

import br.com.fateczl.lipe.controller.GeraNumero;
import br.com.fateczl.lipe.controller.ParOuImpar;

public class Principal {

	public static void main(String[] args) {
		ParOuImpar parOuImpar = new ParOuImpar();
		GeraNumero geraNumero = new GeraNumero(parOuImpar);
		
		geraNumero.gerarNumero();
		geraNumero.gerarNumero();
		geraNumero.gerarNumero();
	}

}
