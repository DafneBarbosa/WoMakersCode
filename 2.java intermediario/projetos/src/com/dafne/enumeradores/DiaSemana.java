package com.dafne.enumeradores;

public enum DiaSemana {
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor; //criando um atributo para podermos atribuir um valor numérios aos dias da semana
	
	DiaSemana(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}

}
