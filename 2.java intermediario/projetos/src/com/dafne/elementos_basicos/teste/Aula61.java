package com.dafne.elementos_basicos.teste;

import com.dafne.elementos_basicos.Contato;

public class Aula61 {

	public static void main(String[] args) {
		
		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		int valor = 10;

		System.out.println("\n***** Valores originais");
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("\n***** Exemplo 1");
		testePassagemValorReferencia(valor, contato);
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("\n***** Exemplo 2");
		testePassagemValorReferencia2(valor, contato);
		System.out.println(contato);
		System.out.println(valor);
	}
	
	private static void testePassagemValorReferencia(int valor, Contato contato){
		int novoValor = valor + 10;
		valor = novoValor;
		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com"); //como estou instanciando um novo objeto, ele muda a referência, não está mais apontando para o mesmo local
		System.out.println("Dentro do método:  "+contato);
	}

	private static void testePassagemValorReferencia2(int valor, Contato contato){
		int novoValor = valor + 10;
		valor = novoValor;
		contato.setNome("Contato"+novoValor); //Aqui a referência ainda é a mesma
	}

}
