package com.dafne.classes_utilitarias.teste;

import java.util.Calendar;

public class Aula87 {
	
	public static void main(String[] args) {
		
		//CLASSE CALENDAR
		
		Calendar hoje = Calendar.getInstance(); //padrão de projeto - singleton - o objeto já está instanciado

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", dia, (mes+1), ano, hora, minutos, segundos); //OBS: mês no java inicia em zero, então temos que sempre fazer (mes+1) para obter de fato o mês que estamos
		
		System.out.println();
		
		hoje.add(Calendar.DAY_OF_MONTH, -1); //com add() podemos adicionar ou subtrair quantidades nos parâmetros do Calendar
		hoje.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
	
	}


}
