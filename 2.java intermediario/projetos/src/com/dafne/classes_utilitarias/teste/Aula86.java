package com.dafne.classes_utilitarias.teste;

import java.util.Date;

public class Aula86 {
	
	public static void main(String[] args) {
		
		//CLASSE DATE
		
		Date hoje = new Date(); //Instanciando 
		
		System.out.println(hoje);
		
		System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());
		
		System.out.println(hoje.getDate()); //retorna o dia

	}

}
