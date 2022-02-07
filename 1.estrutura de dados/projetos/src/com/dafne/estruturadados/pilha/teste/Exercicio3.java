package com.dafne.estruturadados.pilha.teste;

import com.dafne.estruturadados.pilha.Pilha;

public class Exercicio3 {

	public static void main(String[] args) {

		Pilha<Livro> pilha = new Pilha<Livro>(20);
		
		Livro livro;
		for(int i=1;i<=6;i++) {
			livro = new Livro();
			livro.setTitulo("Livro "+i);
			livro.setAutor("Autor "+i);
			
			pilha.empilha(livro);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		System.out.println(pilha.estaVazia());
		System.out.println(pilha.topo());
		pilha.desempilha();
		System.out.println(pilha);
		
	}

}
