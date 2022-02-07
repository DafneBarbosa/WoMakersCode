package com.dafne.estruturadados.pilha.teste;

import java.nio.charset.Charset;
import java.util.Scanner;

import com.dafne.estruturadados.pilha.Pilha;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Recebendo a palavra do usu�rio
		System.out.println("\n---------- TESTE DE PAL�NDROMOS ----------\n");
		System.out.println("Digite uma sequ�ncia de caracteres: ");
		String sequenciaComEspacos = scan.nextLine();
		
		//Tirando espa�os se tiver
		String sequencia = sequenciaComEspacos.replaceAll(" ", "");
		
		//Instanciando nossa pilha
		Pilha<Character> pilha = new Pilha<>();
		
		//Colocando os chars da palavra na pilha
		for(int i=0;i<sequencia.length(); i++) {
			pilha.empilha(sequencia.charAt(i));
		}
		
		System.out.println(pilha);

		String sequenciaInvertida = "";
		while(!pilha.estaVazia()) {
			sequenciaInvertida+=pilha.desempilha();
		}
		
		if(sequencia.equalsIgnoreCase(sequenciaInvertida)) {
			System.out.println("� pal�ndromo!");
		} else {
			System.out.println("n�o pal�ndromo!");
		}
		
		
		/*boolean palindromo = true;
		for(int i=0;i<pilha.tamanho()/2;i++) {
			if(pilha.busca(i)!=pilha.busca(pilha.tamanho()-i-1)) {
				palindromo = false;
			}
		}
		
		System.out.println("� pal�ndromo: "+palindromo);*/
	}

}
