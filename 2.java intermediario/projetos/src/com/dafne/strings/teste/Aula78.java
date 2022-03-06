package com.dafne.strings.teste;

public class Aula78 {
	
	public static void main(String[] args) {
	
		//APRENDENDO A COMPARAR STRINGS
		
		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);	
		
		System.out.println("ola equals ola2 = " + ola.equals(ola2)); //false - caixa alta
		System.out.println("ola equals ola3 = " + ola.equals(ola3)); //true

		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); //true - equalsIgnoreCase() ignora direfenças de maiúsculas e minúsculas
		
		//Operador == compara referência de memória 
		System.out.println("ola == ola2 " + (ola == ola2)); //false - ids diferentes, apontam para lugares diferentes
		System.out.println("ola == ola3 " + (ola == ola3)); //true - ids iguais, apontam para o mesmo lugar
		
		System.out.println("ola == ola4 " + (ola == ola4)); //false - como instanciei o ola4 como objeto, ele recebe novo id
		System.out.println("ola equals ola4 = " + ola.equals(ola4)); //true
		System.out.println("ola equalsIgnoreCase ola4 = " + ola.equalsIgnoreCase(ola4)); //true
		
		
		String banana = "banana";
		String ana = "ana";
		String ban = "ban";
		
		//regionMatches() - compara a região de uma String com outra String
		System.out.println(banana.regionMatches(1, ana, 0, 3)); //iniciando do caracter com indice 1 da string banana, comparar com a String ana, iniciando do caracter com indice 0 da string ana, numero de caracters 3 da string ana
		System.out.println(banana.regionMatches(2, ana, 1, 2));
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3));//esse true é para usar ignoreCase, ou seja, se fosse "Ban" também daria true
		
		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));
		
		
		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaiusculo));
		
		//-1 quando a > b
		//0 quando a == b
		//1 ou >1 quando a<b
	}

}
