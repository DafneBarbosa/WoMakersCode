package com.dafne.strings.teste;

public class Aula83 {
	
	public static void main(String[] args) {
		
		// APRENDENDO A CONCATENAR STRINGS CORRETAMENTE

		//Forma errada - pois cada vez que adiciono uma letra no alfabeto ele cria uma nova variável - nada otimizado
		String[] letras = {"B", "C", "D", "E", "F"};
		String alfabeto = "";
		for (String letra : letras){
			alfabeto += letra;
		}
		System.out.println(alfabeto);
		
		//Forma usando StringBuffer
		StringBuffer sb = new StringBuffer(); //Criando StringBuffer - coleção de Strings
		for (String letra : letras){
			sb.append(letra); //Adicionando caracteres à coleção de strings
		}
		alfabeto = sb.toString(); //trasformando a coleção de strings em uma String única
		System.out.println(alfabeto);
		
		alfabeto = new String(sb); //outra forma de unificar a coleção em uma String única
		System.out.println(alfabeto);
		
		System.out.println(sb.reverse()); //método da classe StringBuffer() - imprime ao contrário
		
		//Forma usando StringBuilder
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras){
			sb_.append(letra);
		}
		alfabeto = sb_.toString();
		System.out.println(alfabeto);
	}

}
