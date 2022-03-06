package com.dafne.enumeradores.teste;

import com.dafne.enumeradores.Operacao;

public class Exercicio1 {

	public static void main(String[] args) {
		
		double resultadoSoma = Operacao.SOMAR.executarOperacao(10, 2);
		System.out.println(resultadoSoma);
		
		System.out.println(Operacao.SUBTRAIR.executarOperacao(10, 2));
		System.out.println(Operacao.MULTIPLICAR.executarOperacao(10, 2));
		System.out.println(Operacao.DIVIDIR.executarOperacao(10, 2));
		
		
		double x = 10.0;
		double y = 1.5;
		
		for(Operacao op : Operacao.values()) {
			System.out.println(x + " " + op.toString() + " " + y + " = " + op.executarOperacao(x, y));
		}
		
	}

}
