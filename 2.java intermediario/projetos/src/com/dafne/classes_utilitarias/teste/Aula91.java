package com.dafne.classes_utilitarias.teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91 {
	
	public static void main(String[] args) {
		
		//Formatando datas - DateFormat com Locale
		
		Date hoje = new Date();

		System.out.println("Data não formatada:  " + hoje); //Date não formatado
		System.out.println("Locale Default:      " + Locale.getDefault()); //Locale default
		
		String hojeFormatado = DateFormat.getInstance().format(hoje); //Formatando Date
		System.out.println("Date formatada BR:   " + hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println("Hora formatada BR:   " + hojeFormatado);

		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println("Data formatada BR:   " + hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println("Date formatada BR:   " + hojeFormatado);
		
		System.out.println();
		
		Locale.setDefault(new Locale("en", "US")); //Setando novo Locale
		hojeFormatado = DateFormat.getInstance().format(hoje); //Formatando date com novo Locale
		System.out.println("Date formatada US:   " + hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println("Hora formatada US:   " + hojeFormatado);

		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println("Data formatada US:   " + hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println("Date formatada US:   " + hojeFormatado);
		
		System.out.println();
		Locale.setDefault(new Locale("pt", "Brazil")); //Setando novo Locale
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje); //Formato curto da hora
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje); //Formato médio
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje); //Formato longo
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		System.out.println();
		
		String data = "12/02/2017 14:25";
		try {
			Date dataDate = DateFormat.getInstance().parse(data); //parseando string em date
			System.out.println(dataDate);
			
			Calendar calendario = Calendar.getInstance(); //instanciando um calendar
			calendario.setTime(dataDate); //transformando de date para calendar
			System.out.println(calendario);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
