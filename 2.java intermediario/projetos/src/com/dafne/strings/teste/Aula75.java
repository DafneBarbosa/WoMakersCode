package com.dafne.strings.teste;

public class Aula75 {
	
	public static void main(String[] args) {
		
		//APRENDENDO A CRIAR STRINGS
		
		//Primeira forma - atrav�s do operador new, uma vez que String � um objeto - cada vari�vel instanciada aponta para um lugar diferente na mem�ria, mesmo se tiverem o mesmo valor
		String vazia = new String(); //Construtor vazio
		System.out.println(vazia);

		String java = new String("JAVA"); //Construtor passando uma String
		System.out.println(java);
		
		String java1 = new String(java); //Construtor passando a refer�ncia de outra vari�vel String
		System.out.println(java1);
		
		char[] charsJava = {'J', 'A', 'V', 'A'};
		String java2 = new String(charsJava); //Construtor passando um array de char
		System.out.println(java2);
		
		char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
		String abc = new String(abcdef, 0, 3); //Construtor passando um array de char, mas somente algumas posi��es
		System.out.println(abc);
		
		byte[] ascii = {65, 66, 67, 68, 69}; //Construtor passando um array de byte - tabela ASCII
		String abcde = new String(ascii);
		System.out.println(abcde);
		
		String bcd = new String(ascii, 1, 3); //Construtor passando um array de byte, mas somente algumas posi��es
		System.out.println(bcd);
		
		//Segunda forma - atribui��o simples - vari�veis com mesmo valor apontam para o mesmo lugar na mem�ria, ex: java3 e java4 apontam para um mesmo objeto
		String java3 = "JAVA";
		String java4 = "JAVA";
		String java5 = "java";
		
		System.out.println(java3);
		System.out.println(java4);
	}

}
