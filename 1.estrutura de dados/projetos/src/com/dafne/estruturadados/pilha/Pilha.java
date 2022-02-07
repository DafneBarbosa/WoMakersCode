package com.dafne.estruturadados.pilha;

import com.dafne.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	
	public T desempilha() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[--tamanho];
	}
	
	public T topo() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[tamanho-1];
	}

}
