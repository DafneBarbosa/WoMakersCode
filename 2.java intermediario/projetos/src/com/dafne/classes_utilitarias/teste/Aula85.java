package com.dafne.classes_utilitarias.teste;

public class Aula85 {
	
	public static void main(String[] args) {
		
		//CLASSE MATH
		
		System.out.println(Math.pow(2, 3));
		
		System.out.println(Math.round(4.7));
		System.out.println(Math.round(4.5)); // >=0.5 arredonda para cima, <0.5 arredonda para baixo
		System.out.println(Math.round(4.4));
		
		System.out.println(Math.ceil(4.4)); //ceil() sempre arredonda para baixo
		System.out.println(Math.ceil(4.7));
		
		System.out.println(Math.floor(4.4)); //floor() sempre arredonda para cima
		System.out.println(Math.floor(4.7));
		
		System.out.println(Math.round(Math.random() * 100)); //n�mero rand�mico entre 0 e 100
		
		//Problema da linguagem java com n�meros - n�o � uma linguagem 100% segura para trabalhar com n�meros primitivos - usamos ent�o BigInteger e BigDecimal
		System.out.println(Math.sin(Math.toRadians(30))); //seno
		System.out.println(Math.cos(Math.toRadians(1))); //cosseno
		System.out.println(Math.tan(Math.toRadians(45))); //tangente

	}

}
