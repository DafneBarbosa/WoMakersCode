package com.dafne.estruturadados.pilha.teste;

import java.util.Scanner;

import com.dafne.estruturadados.pilha.Pilha;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Pilha<Integer> pilhaPar = new Pilha<Integer>(10);
		Pilha<Integer> pilhaImpar = new Pilha<Integer>(10);

		for (int i = 1; i <= 10; i++) {

			System.out.println("\nDigite um número inteiro: ");
			int num = scan.nextInt();

			if(num == 0) {
				if(pilhaPar.estaVazia()) {
					System.out.println("PilhaPar está vazia, não é possível desempilhar");
				} else {
					pilhaPar.desempilha();
				}
				if(pilhaImpar.estaVazia()) {
					System.out.println("PilhaImpar está vazia, não é possível desempilhar");
				} else {
					pilhaImpar.desempilha();
				}
			} else if (num % 2 == 0) {
				pilhaPar.empilha(num);
			} else {
				pilhaImpar.empilha(num);
			}

			System.out.println("PilhaPar = "+pilhaPar+"\nPilhaImpar = "+pilhaImpar);
		}


		while (!pilhaPar.estaVazia()) {
			pilhaPar.desempilha();
		}

		while (!pilhaImpar.estaVazia()) {
			pilhaImpar.desempilha();
		}

		System.out.println("Todos os elementos foram desempilhados");
		System.out.println("PilhaPar = "+pilhaPar+"\nPilhaImpar = "+pilhaImpar);
	}
}
