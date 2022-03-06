package com.dafne.strings.teste;

import java.util.StringTokenizer;

public class Aula84 {
	
	public static void main(String[] args) {
		
		// APRENDENDO EXTRAIR STRINGS
		
		String doArquivo = "1;Ant�nio;30;";
		
		// Com o StringTokenizer consigo extrair informa��es de uma String atrav�s de um separador, mas ao inv�s de transform�-las em um array (split()), transformamos essa informa��es em tokens
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
