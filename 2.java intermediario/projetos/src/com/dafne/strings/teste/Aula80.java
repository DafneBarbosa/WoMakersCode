package com.dafne.strings.teste;

public class Aula80 {
	
	public static void main(String[] args) {
		
		// APRENDENDO A MODIFICAR UMA STRING
		
		String teste = "Isso é um teste.";
		System.out.println(teste);
		System.out.println(teste.substring(10)); //pega um pedaço da string teste começando pelo índice 10
		System.out.println(teste.substring(10, 15)); //pega um pedaço da string teste começando pelo índice 10, indo até o índice 15 (não imprime o 15, só o 14) 

		String ola = "olá";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); //concatena ola + mundo
		System.out.println(olaMundo);
		
		String espacos = "i s p a ç o i";
		String semEspacos = espacos.replace('i', 'e'); //Troca i por e, na String espacos
		System.out.println(semEspacos);
		
		semEspacos = semEspacos.replaceAll(" ", ""); //Remove todos os espaços da String
		System.out.println(semEspacos);
		
		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim()); //tira espaços antes e depois da String
		
	}

}
