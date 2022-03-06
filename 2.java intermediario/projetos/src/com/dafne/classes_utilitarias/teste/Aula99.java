package com.dafne.classes_utilitarias.teste;

import java.util.Random;

public class Aula99 {
	
	public static void main(String[] args) {
		
		//Classe Random
		
		//Forma 1 de gerar números aleatórios - método random() da classe Math - usado para intervalos 10, 100, 1000
		System.out.println(Math.floor(Math.random() * 100));
		
		//Forma 2 de gerar números aleatórios - usando classe Random - usados em intervalos mais específicos 5 , 25, 137...
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt()); //sem especificar o intervalo
		
		System.out.println(aleatorio.nextInt(5 + 1)); //especificando o intervalo - de 0 a 5
	}

}
