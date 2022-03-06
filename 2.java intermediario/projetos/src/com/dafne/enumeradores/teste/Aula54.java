package com.dafne.enumeradores.teste;

import com.dafne.enumeradores.Data;
import com.dafne.enumeradores.DiaSemana;

public class Aula54 {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.SEGUNDA;
		System.out.println(dia.toString()+" - "+dia.getValor());
		
		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
	}
}
