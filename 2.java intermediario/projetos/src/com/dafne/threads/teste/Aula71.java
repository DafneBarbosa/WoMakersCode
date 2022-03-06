package com.dafne.threads.teste;

import com.dafne.threads.MinhaThreadSoma;

public class Aula71 {
	
public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		//Vamos criar duas threads que v�o acessar o m�todo soma, da classe Calculadora
		MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);
		MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);
		
		//Se o m�todo somaArray, da classe Calculadora, n�o fosse sincronizado ia ser uma bagun�a, sa�da sem synchronized:
		/*  #1 iniciada
			#2 iniciada
			Executando a soma #1 somando o valor 1 com total de 1
			Executando a soma #2 somando o valor 1 com total de 1
			Executando a soma #1 somando o valor 2 com total de 3
			Executando a soma #2 somando o valor 2 com total de 5
			Executando a soma #1 somando o valor 3 com total de 8
			Executando a soma #2 somando o valor 3 com total de 11
			Executando a soma #1 somando o valor 4 com total de 15
			Executando a soma #2 somando o valor 4 com total de 19
			Executando a soma #1 somando o valor 5 com total de 24
			Executando a soma #2 somando o valor 5 com total de 29
			Resultado da soma para thread #1 �: 29
			#1 terminada
			Resultado da soma para thread #2 �: 29
			#2 terminada   */

	}

}
