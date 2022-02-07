package com.dafne.estruturadados.vetor.teste;

import com.dafne.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetorInteiros = new VetorObjetos(3);
		vetorInteiros.adiciona(3);
		vetorInteiros.adiciona(4);
		vetorInteiros.adiciona(5);
		vetorInteiros.adiciona(5+5);
		System.out.println(vetorInteiros);
		
		
		VetorObjetos vetorContatos = new VetorObjetos(3);
		
		Contato c1 = new Contato("Ana", "cjciuw");
		Contato c2 = new Contato("João", "jeued");
		Contato c3 = new Contato("Maria", "jegdwu");

		vetorContatos.adiciona(c1);
		vetorContatos.adiciona(c2);
		vetorContatos.adiciona(c3);
		
		System.out.println(vetorContatos);
		
		Contato c4 = new Contato("Ana", "cjciuw"); //Como a classe Contato tem o método equals, ele compara os atributos e descobre que o c4 == c1, apesar de não serem o mesmo objeto
		System.out.println(vetorContatos.busca(c4));
		
		//PROBLEMA! Consigo adicionar elementos de tipos diferentes ao mesmo vetor
		VetorObjetos vetorMix = new VetorObjetos(3);
		vetorMix.adiciona(3);
		vetorMix.adiciona("ABC");
		vetorMix.adiciona(c1);
		System.out.println(vetorMix);
	}

}
