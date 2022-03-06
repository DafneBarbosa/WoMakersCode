package com.dafne.enumeradores.teste;

import com.dafne.enumeradores.DiaSemana;

public class Aula55 {

	public static void main(String[] args) {
		
		//Como enums s�o cole��es de constantes, o m�todo values() retorna um array com todos os valores dentro de um enumerador
		DiaSemana[] dias = DiaSemana.values();
		
		//Posso iterar esse array com um for normal
		for(int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		//Ou posso iterar com um for melhorado
		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}
		
		//Posso tamb�m pesquisar o enumerador atrav�s de uma String
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
	}

}
