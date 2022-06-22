package br.com.fateczl.lipe.controller;

public class ParOuImpar implements IObservador {

	@Override
	public void numeroParOuImpar(int numero) {
		if (numero % 2 == 0)
			System.out.println("O número " + numero + " é par!");
		else
			System.out.println("O número " + numero + " é ímpar!");
	}
	
}
