package com.dafne.estruturadados.pilha.teste;

import java.util.Scanner;
import java.util.Stack;

import com.dafne.estruturadados.pilha.Pilha;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Pilha<Integer> pilha = new Pilha<Integer>(10);
		
		for(int i=1; i<=10;i++) {
			System.out.println("\nDigite um n�mero inteiro: ");
			int num = scan.nextInt();
			
			if(num%2==0) {
				System.out.println("Empilhando o n�mero "+num);
				pilha.empilha(num);
			} else {
				
				Integer desempilhado = pilha.desempilha();
				
				if(desempilhado==null) {
					System.out.println("Pilha est� vazia, n�o � poss�vel desempilhar");
				} else {
					System.out.println("Desempilhando n�mero "+desempilhado);
				}
			}
		}
		
		System.out.println(pilha);

		while(!pilha.estaVazia()) {
			pilha.desempilha();
		}
		
		System.out.println("Todos os elementos foram desempilhados");
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}
	
	

}
