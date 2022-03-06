package com.dafne.classes_utilitarias.teste;

import java.util.Calendar;

public class Aula87 {
	
	public static void main(String[] args) {
		
		//CLASSE CALENDAR
		
		Calendar hoje = Calendar.getInstance(); //padr�o de projeto - singleton - o objeto j� est� instanciado

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje � : %02d/%02d/%d %02d:%02d:%02d", dia, (mes+1), ano, hora, minutos, segundos); //OBS: m�s no java inicia em zero, ent�o temos que sempre fazer (mes+1) para obter de fato o m�s que estamos
		
		System.out.println();
		
		hoje.add(Calendar.DAY_OF_MONTH, -1); //com add() podemos adicionar ou subtrair quantidades nos par�metros do Calendar
		hoje.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
	
	}


}
