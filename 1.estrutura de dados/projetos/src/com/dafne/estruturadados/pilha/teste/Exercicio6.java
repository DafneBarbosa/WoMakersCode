package com.dafne.estruturadados.pilha.teste;

import com.dafne.estruturadados.pilha.Pilha;

public class Exercicio6 {

	public static void main(String[] args) {
		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("{[()]}[](){()}");
		imprimeResultado("{[(]}[](){()}");
		imprimeResultado("A + B + C - D)");
	}
	
	public static void imprimeResultado(String expressao){
		System.out.println(expressao + " está balanceado? " + 
				verificaSimbolosBalanceados(expressao));
	}
	
	
	final static String ABRE = "({[";
	final static String FECHA = ")}]";
	
	
	public static boolean verificaSimbolosBalanceados(String expressao) {
		
		Pilha<Character> pilha = new Pilha<>();
		char caracter, topo;
		boolean balanceado = true;
		
		for(int i=0;i<expressao.length(); i++) {
			caracter = expressao.charAt(i);
			
			if(ABRE.indexOf(caracter)>-1) {	//verifica se o caracter é um dos que existe na nossa variável ABRE
				pilha.empilha(caracter);
			} else if(FECHA.indexOf(caracter)>-1) {
				if(pilha.estaVazia()) {
					return false;
				} else {
					topo = pilha.desempilha();
					
					if(ABRE.indexOf(topo)!=FECHA.indexOf(caracter)) {
						return false;
					}
				}
			}
		}	
		return true;
	}
	
	
	
}
