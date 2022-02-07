package com.dafne.estruturadados.pilha.teste;

import com.dafne.estruturadados.pilha.Pilha;

public class Aula14 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		for(int i=1;i<=10;i++) {
			pilha.empilha(i);
		}

		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}

}
