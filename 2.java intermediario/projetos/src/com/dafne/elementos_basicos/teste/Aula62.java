package com.dafne.elementos_basicos.teste;

//Aula 62 - Varargs
public class Aula62 {

	public static void main(String[] args) {
		
		System.out.println(soma(1, 2)); //m�todo soma passando dois par�metros
		System.out.println(soma(1, 2, 3)); //m�todo soma passando tr�s par�metros

		int[] vetor = {1, 2, 3, 4, 5};
		System.out.println(soma(vetor)); //m�todo soma passando um vetor
		
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); //m�todo soma usando varargs
	}

	static int soma(int a, int b){ //m�todo soma passando dois par�metros
		return a + b;
	}

	static int soma(int a, int b, int c){ //m�todo soma passando tr�s par�metros
		return a + b + c;
	}

	static int soma(int[] vetor){ //m�todo soma passando um vetor
		int total = 0;
		for (int i=0; i<vetor.length; i++){
			total += vetor[i];
		}
		return total;
	}

	static int soma(Integer... vetor){ //m�todo soma usando varargs

		int total = 0;

		for (int i=0; i<vetor.length; i++){
			total += vetor[i];
		}

		return total;

	}
	//OBS: se precisar de outros par�metros al�m do varargs, colocar eles na frente, ex: static int soma(int a, int b, Integer... vetor)
}
