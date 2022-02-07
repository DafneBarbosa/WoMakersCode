package com.dafne.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	//Aula 02 - adiconando elementos atraves de itera��o com for
		/* public void adiciona(String elemento) {
			for(int i=0; i<this.elementos.length; i++) {
				if(this.elementos[i]==null) {  	//verificando se o elemento � nullo 
					this.elementos[i] = elemento;
					break;	//assim que ele conseguir adicionar o elemento paramos o for
				}
			}
		} */
	
	//Aula 03 - adicinando elementos sabendo o tamanho real do vetor, lan�ando uma exception se vetor estiver cheio
		/* public void adiciona(String elemento) throws Exception{
			if(this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho ++;
			} else {
				throw new Exception("Vetor j� est� cheio, n�o � poss�vel adicionar mais elementos.");
			} 
		}*/
	
	//Aula 03 - adicionando elementos sabendo o tamanho real do vetor, retornando false se vetor estiver cheio
	public boolean adiciona(String elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho ++;
			return true;
		} else {
			return false;
		} 
	}
	
	//Aula 04 - get to tamanho real do vetor
	public int tamanho() {
		return this.tamanho;
	}
	
	//Aula 04 - impriminto elementos do vetor com toString e usando StringBuilder para concatenar strings
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
	
	//Aula 05 - Buscando elemento e lan�ando exception se a posi��o for inv�lida
	public String busca(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}
		return this.elementos[posicao];
	}
	
	//Aula 06 - Buscando se um determinado elemento existe no vetor
	public int busca(String elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	//Aula 07 - adicionando um elemento em qualquer posi��o do vetor
	public void adiciona(int posicao, String elemento) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}
		
		this.aumentaCapacidade();
		
		for(int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}
	
	//Aula08 - aumentando a capacidade do vetor (dobrar a capacidade)
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//Aula09 - removendo um elemento do vetor, sabendo sua posi��o
	public void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}

		for(int i=posicao;i<this.tamanho-1;i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho--;
	}
	
	//Aula09 - removendo um elemento espec�fico do vetor sem saber sua posi��o
	public void remove(String elemento) {
		this.remove(this.busca(elemento));
	}
	
	
	
	
}
