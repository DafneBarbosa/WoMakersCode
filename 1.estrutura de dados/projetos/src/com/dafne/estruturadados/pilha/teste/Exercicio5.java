package com.dafne.estruturadados.pilha.teste;

import java.nio.charset.Charset;
import java.util.Scanner;

import com.dafne.estruturadados.pilha.Pilha;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Recebendo a palavra do usuário
		System.out.println("\n---------- TESTE DE PALÍNDROMOS ----------\n");
		System.out.println("Digite uma sequência de caracteres: ");
		String sequenciaComEspacos = scan.nextLine();
		
		//Tirando espaços se tiver
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
			System.out.println("É palíndromo!");
		} else {
			System.out.println("não palíndromo!");
		}
		
		
		/*boolean palindromo = true;
		for(int i=0;i<pilha.tamanho()/2;i++) {
			if(pilha.busca(i)!=pilha.busca(pilha.tamanho()-i-1)) {
				palindromo = false;
			}
		}
		
		System.out.println("É palíndromo: "+palindromo);*/
	}

}
