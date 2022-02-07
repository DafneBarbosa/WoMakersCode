package com.dafne.estruturadados.vetor.teste;

import com.dafne.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		System.out.println(vetor);
		
		vetor.adiciona(0, "elemento 0");
		System.out.println(vetor);
		
		vetor.adiciona(3, "elemento 4");
		System.out.println(vetor);
		
		vetor.adiciona(6, "elemento 5");
		System.out.println(vetor);

		
	}

}
