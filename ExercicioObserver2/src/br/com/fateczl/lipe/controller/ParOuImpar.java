package br.com.fateczl.lipe.controller;

public class ParOuImpar implements IObservador {

	@Override
	public void numeroParOuImpar(int numero) {
		if (numero % 2 == 0)
			System.out.println("O n�mero " + numero + " � par!");
		else
			System.out.println("O n�mero " + numero + " � �mpar!");
	}
	
}
