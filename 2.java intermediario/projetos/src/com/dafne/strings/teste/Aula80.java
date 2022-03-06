package com.dafne.strings.teste;

public class Aula80 {
	
	public static void main(String[] args) {
		
		// APRENDENDO A MODIFICAR UMA STRING
		
		String teste = "Isso � um teste.";
		System.out.println(teste);
		System.out.println(teste.substring(10)); //pega um peda�o da string teste come�ando pelo �ndice 10
		System.out.println(teste.substring(10, 15)); //pega um peda�o da string teste come�ando pelo �ndice 10, indo at� o �ndice 15 (n�o imprime o 15, s� o 14) 

		String ola = "ol�";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); //concatena ola + mundo
		System.out.println(olaMundo);
		
		String espacos = "i s p a � o i";
		String semEspacos = espacos.replace('i', 'e'); //Troca i por e, na String espacos
		System.out.println(semEspacos);
		
		semEspacos = semEspacos.replaceAll(" ", ""); //Remove todos os espa�os da String
		System.out.println(semEspacos);
		
		String nome = " meu nome �: ";
		System.out.println(nome);
		System.out.println(nome.trim()); //tira espa�os antes e depois da String
		
	}

}
