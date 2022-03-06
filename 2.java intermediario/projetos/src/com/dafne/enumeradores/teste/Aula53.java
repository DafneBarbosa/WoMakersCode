package com.dafne.enumeradores.teste;

import com.dafne.enumeradores.DiaSemana;
import com.dafne.enumeradores.DiaSemanaConstantes;

public class Aula53 {
	
	public static void main(String[] args) {
		
		usandoConstantes();
		UsandoEnums();
		
	}
	
	private static void usandoConstantes() {
		int segunda = DiaSemanaConstantes.SEGUNDA; //usando as constantes declaradas na classe DiaSemanaConstantes
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("\nTeste Utilizando constantes no java");
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	private static void imprimeDiaSemana(int dia) {
		switch (dia) {
		case 1: 
			System.out.println("Segunda-feira");
			break;
		case 2: 
			System.out.println("Terça-feira");
			break;
		case 3: 
			System.out.println("Quarta-feira");
			break;
		case 4: 
			System.out.println("Quinta-feira");
			break;
		case 5: 
			System.out.println("Sexta-feira");
			break;
		case 6: 
			System.out.println("Sábado");
			break;
		case 7: 
			System.out.println("Domingo");
			break;
		}
	}
	
	private static void UsandoEnums() {
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("\nTeste Utilizando enums no java");
		imprimeDiaSemana(segunda.getValor());
		imprimeDiaSemana(terca.getValor());
		imprimeDiaSemana(quarta.getValor());
		imprimeDiaSemana(quinta.getValor());
		imprimeDiaSemana(sexta.getValor());
		imprimeDiaSemana(sabado.getValor());
		imprimeDiaSemana(domingo.getValor());
	}
}
