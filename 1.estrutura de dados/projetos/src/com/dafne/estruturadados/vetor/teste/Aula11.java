package com.dafne.estruturadados.vetor.teste;

import com.dafne.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<String> vetorStrings = new Lista(3);
		vetorStrings.adiciona("A");
		vetorStrings.adiciona("B");
		System.out.println(vetorStrings);

		Lista<Integer> vetorInteiros = new Lista(5);
		vetorInteiros.adiciona(1);
		vetorInteiros.adiciona(34);
		System.out.println(vetorInteiros);
		
		Lista<Contato> vetorContatos = new Lista(2);
		Contato c1 = new Contato("Ana", "cjciuw");
		vetorContatos.adiciona(c1);
		System.out.println(vetorContatos);
	}

}
