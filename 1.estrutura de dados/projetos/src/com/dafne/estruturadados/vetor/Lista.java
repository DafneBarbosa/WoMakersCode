package com.dafne.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T>{

	private T[] elementos;
	private int tamanho;
	
	//Instanciando um vetor genericamente usando reflection
	/* public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}*/
	
	//Instanciando um vetor genericamente criando um vetor do tipo objeto e fazendo um casting para o tipo que preciso
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; 
		this.tamanho = 0;
	}
	
	public boolean adiciona(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho ++;
			return true;
		} else {
			return false;
		} 
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Vetor = [");
		
		for(int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		return s.toString();
	}
	
	public T busca(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.elementos[posicao];
	}
	
	public int busca(T elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void adiciona(int posicao, T elemento) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		
		this.aumentaCapacidade();
		
		for(int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}

		for(int i=posicao;i<this.tamanho-1;i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho--;
	}
	
	
	
	
	//Exercício 1 - implementar método contem
	public boolean contem(T elemento) {
		return this.busca(elemento)>=0;
	}
	
	//Exercício 2 - implementar método ultimoIndice
	public int ultimoIndice(T elemento) {
		for(int i=this.tamanho-1; i>=0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	//Exercício 3 - implementando outro método remove
	public void remove(T elemento) {
		int posicao = this.busca(elemento);
		if(posicao>-1) {
			this.remove(posicao);
		}
		System.out.println("Elemento '"+elemento+"' não existe no vetor");
	}
	
	//Exercício 4 - implementando método obtem
	public T obtem(int posicao) {
		return this.busca(posicao);
	}
	
	//Exercício 5 - implementando método limpar (remove todos elementos)
	public void limpar() {
		//opcao 1 - instanciando nova lista com mesmo length da antiga
		//this.elementos = (T[]) new Object[this.elementos.length];
		
		//opcao 2 - zerando tamanho (o lixo continua)
		//this.tamanho = 0;
		
		//opcao 3 - zerando o tamanho e "apagando" o lixo
		for(int i=0; i<this.tamanho; i++) {
			this.elementos[i]=null;
		}
		this.tamanho = 0;
	}
	
	
	
	
}
