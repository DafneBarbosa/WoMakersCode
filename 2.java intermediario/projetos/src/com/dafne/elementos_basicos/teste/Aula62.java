package com.dafne.elementos_basicos.teste;

//Aula 62 - Varargs
public class Aula62 {

	public static void main(String[] args) {
		
		System.out.println(soma(1, 2)); //método soma passando dois parâmetros
		System.out.println(soma(1, 2, 3)); //método soma passando três parâmetros

		int[] vetor = {1, 2, 3, 4, 5};
		System.out.println(soma(vetor)); //método soma passando um vetor
		
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); //método soma usando varargs
	}

	static int soma(int a, int b){ //método soma passando dois parâmetros
		return a + b;
	}

	static int soma(int a, int b, int c){ //método soma passando três parâmetros
		return a + b + c;
	}

	static int soma(int[] vetor){ //método soma passando um vetor
		int total = 0;
		for (int i=0; i<vetor.length; i++){
			total += vetor[i];
		}
		return total;
	}

	static int soma(Integer... vetor){ //método soma usando varargs

		int total = 0;

		for (int i=0; i<vetor.length; i++){
			total += vetor[i];
		}

		return total;

	}
	//OBS: se precisar de outros parâmetros além do varargs, colocar eles na frente, ex: static int soma(int a, int b, Integer... vetor)
}
