package com.dafne.strings.teste;

import com.dafne.strings.Pessoa;

public class Aula82 {
	
	public static void main(String[] args) {
		
		// APRENDENDO A JUNTAR E SEPARAR STRINGS
		
		String alfabeto = String.join(", ", "A", "B", "C", "D"); //passamos vários caracteres e um separador, ele junta e transforma em uma String
		System.out.println(alfabeto);

		String[] letras = alfabeto.split(", "); //passamos um separador, ele separa nossa String, cada vez que ele encontra esse separador e coloca em um array
		for (String letra : letras){
			System.out.println(letra);
		}
		
		String doArquivo = "1;Antônio;30;";
		String[] infos = doArquivo.split(";"); //separando a String nos ;
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2])); //Construindo um objeto Pessoa através dos dados obtidos acima
		System.out.println(pessoa);
	}

}
