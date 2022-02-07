package com.dafne.estruturadados.fila.teste;

import com.dafne.estruturadados.fila.Fila;

public class Aula20 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<Integer>();
		System.out.println(fila);
		System.out.println(fila.estaVazia());

		fila.enfileira(10);
		fila.enfileira(2);
		fila.enfileira(54);

		System.out.println(fila);
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());

	}
}
