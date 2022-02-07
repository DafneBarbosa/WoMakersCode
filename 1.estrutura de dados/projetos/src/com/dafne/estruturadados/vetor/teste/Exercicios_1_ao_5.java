package com.dafne.estruturadados.vetor.teste;

import com.dafne.estruturadados.vetor.Lista;

public class Exercicios_1_ao_5 {

	public static void main(String[] args) {
		
		//Exercicio 1 - implementado o metodo contem na classe Lista
		Lista<String> vetorStrings = new Lista(3);
		vetorStrings.adiciona("A");
		vetorStrings.adiciona("B");
		System.out.println(vetorStrings);
		System.out.println("Vetor contem A: "+vetorStrings.contem("A"));
		System.out.println("Vetor contem a: "+vetorStrings.contem("a"));
		
		//Exercicio 2 - implementado o metodo ultimoIndice na classe Lista
		vetorStrings.adiciona("A");
		System.out.println(vetorStrings);
		System.out.println("Ultima posição do A: "+vetorStrings.ultimoIndice("A"));

		//Exercicio 3 - implementado o metodo remove(T elemento) na classe Lista
		vetorStrings.remove("B");
		System.out.println(vetorStrings);
		vetorStrings.remove("D");

		//Exercicio 4 - implementado o metodo obtem na classe Lista
		vetorStrings.adiciona("B");
		System.out.println(vetorStrings);
		System.out.println("Elemento na posição 2: "+vetorStrings.obtem(2));
		
		//Exercicio 5 - implementado o metodo limpar na classe Lista
		System.out.println(vetorStrings);
		vetorStrings.limpar();
		System.out.println(vetorStrings);
		
		
	}

}
