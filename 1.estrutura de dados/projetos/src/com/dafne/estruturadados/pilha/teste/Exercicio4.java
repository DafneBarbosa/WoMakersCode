package com.dafne.estruturadados.pilha.teste;

import java.util.Stack;

public class Exercicio4 {

	public static void main(String[] args) {

		Stack<Livro> stack = new Stack<Livro>();
		
		Livro livro;
		for(int i=1;i<=6;i++) {
			livro = new Livro();
			livro.setTitulo("Livro "+i);
			livro.setAutor("Autor "+i);
			
			stack.push(livro);
		}
		
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);

	}

}
