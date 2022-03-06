package com.dafne.strings.teste;

public class Aula79 {
	
	public static void main(String[] args) {
		
		// APRENDENDO A FAZER BUSCAS DENTRODE UMA STRING
		
		String banana = "banana";
		String ana = "ana";

		System.out.println(banana.indexOf('x')); //retorna o índice da primeira vez que um caracter ou outra string aparece dentro da string selecionada (retorna -1 se não houver aquele caracter ou string)
		System.out.println(banana.indexOf('b'));
		System.out.println(banana.indexOf('a'));
		
		System.out.println(banana.indexOf(ana));
		
		System.out.println(banana.lastIndexOf('a')); //retorna o índice da última vez que um caracter ou outra string aparece dentro da string selecionada (retorna -1 se não houver aquele caracter ou string)
		System.out.println(banana.lastIndexOf(ana));
		
		System.out.println(banana.contains(ana)); //retorna true ou false se um caracter ou string existe dentro de outra string
		System.out.println(banana.contains("ceu"));
	}

}
