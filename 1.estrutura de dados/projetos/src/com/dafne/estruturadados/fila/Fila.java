package com.dafne.estruturadados.fila;

import com.dafne.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		super.adiciona(elemento);
	}
	
	public void desenfileira() {
		if(this.estaVazia()) {
			System.out.println("Fila est� vazia, n�o � poss�vel remover elementos");
		} else {
			super.remove(0);
		}
	}
	
	public T espiar() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}

}
