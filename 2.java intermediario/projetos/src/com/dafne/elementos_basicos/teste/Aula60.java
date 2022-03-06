package com.dafne.elementos_basicos.teste;

import com.dafne.elementos_basicos.EscopoVariaveis;

public class Aula60 {

	public static void main(String[] args) {
		
		EscopoVariaveis escopo = new EscopoVariaveis();
		escopo.setValor(10);

		System.out.println(escopo.getValor()); //10

		System.out.println(escopo.calculaValor(20)); //20 ou 30?

		System.out.println(escopo.getValor()); //10 ou 20?

		System.out.println(escopo.teste()); //4 ou 9

		System.out.println(escopo.getValor());
		
		escopo.maiUmOutroTeste(2);

	}

}
