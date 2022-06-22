package br.com.fateczl.lipe.controller;

import java.util.Random;

public class GeraNumero implements IObservavel {
	
	private Random geradorNumero = new Random();
	private int numero;
	private ParOuImpar parOuImpar;

	public GeraNumero(ParOuImpar parOuImpar) {
		this.parOuImpar = parOuImpar;
	}
	
	@Override
	public void gerarNumero() {
		this.numero = geradorNumero.nextInt(1001);
		this.parOuImpar.numeroParOuImpar(numero);
	}

}
