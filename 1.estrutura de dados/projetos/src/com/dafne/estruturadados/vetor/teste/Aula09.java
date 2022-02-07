package com.dafne.estruturadados.vetor.teste;

import com.dafne.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		System.out.println(vetor);
		System.out.println(vetor.tamanho());
		
		vetor.remove(1);
		System.out.println(vetor);
		System.out.println(vetor.tamanho());
		
		vetor.remove("elemento 3");
		System.out.println(vetor);
		System.out.println(vetor.tamanho());

	}

}
