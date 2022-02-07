package com.dafne.estruturadados.pilha.teste;

import java.util.Stack;

public class Aula18 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(2);
		stack.push(34);
		stack.push(23);
		
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack);

	}

}
