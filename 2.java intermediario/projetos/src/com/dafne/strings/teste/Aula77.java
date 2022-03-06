package com.dafne.strings.teste;

import java.util.Arrays;

public class Aula77 {
	
	public static void main(String[] args) {
	
		//APRENDENDO A EXTRAIR CARACTERES DE UMA STRING
		
		String java = "Java";
		for (int i=0; i<java.length(); i++){
			System.out.println(java.charAt(i)); //charAt() - acessamos cada caracter dentro da String
		}

		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0); //getChars() - extrai caracteres da String java e atribuir eles a um array de chars
		System.err.println(jav);
		
		//Esse código acima seria o mesmo que:
		for (int i=0, j=0; i<3; i++, j++){
			jav[j] = java.charAt(i);
		}
		System.out.println(jav);
		
		byte[] javBytes = new byte[3];
		java.getBytes(0, 3, javBytes, 0); //getBytes() - extrai caracteres da String java e atribuir eles a um array de bytes
		System.out.println(Arrays.toString(javBytes));
		
		char[] javaChars = java.toCharArray(); //toCharArray() - transforma a String em array de char
		System.out.println(javaChars);
	}

}
