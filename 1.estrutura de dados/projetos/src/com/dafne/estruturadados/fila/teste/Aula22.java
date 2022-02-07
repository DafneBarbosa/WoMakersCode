package com.dafne.estruturadados.fila.teste;

import com.dafne.estruturadados.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<Integer>();
		
		fila.enfileira(10);
		fila.enfileira(2);
		fila.enfileira(54);

		System.out.println(fila);
		System.out.println(fila.tamanho());
		
		fila.desenfileira();
		System.out.println(fila);
		System.out.println(fila.tamanho());
		
		fila.desenfileira();
		System.out.println(fila);
		System.out.println(fila.tamanho());

	}

}
