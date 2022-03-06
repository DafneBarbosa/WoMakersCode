package com.dafne.strings.teste;

import java.util.StringTokenizer;

public class Aula84 {
	
	public static void main(String[] args) {
		
		// APRENDENDO EXTRAIR STRINGS
		
		String doArquivo = "1;Antônio;30;";
		
		// Com o StringTokenizer consigo extrair informações de uma String através de um separador, mas ao invés de transformá-las em um array (split()), transformamos essa informações em tokens
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
