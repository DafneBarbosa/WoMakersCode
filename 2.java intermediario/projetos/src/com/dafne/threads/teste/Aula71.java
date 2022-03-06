package com.dafne.threads.teste;

import com.dafne.threads.MinhaThreadSoma;

public class Aula71 {
	
public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		//Vamos criar duas threads que vão acessar o método soma, da classe Calculadora
		MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);
		MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);
		
		//Se o método somaArray, da classe Calculadora, não fosse sincronizado ia ser uma bagunça, saída sem synchronized:
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
			Resultado da soma para thread #1 é: 29
			#1 terminada
			Resultado da soma para thread #2 é: 29
			#2 terminada   */

	}

}
