package com.dafne.classes_utilitarias.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89 {
	
	public static void main(String[] args) {
		
		//Classe SimpleDateFormat
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy   hh:mm:ss   a   z");
		
		Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25);
		System.out.println(sdf.format(data.getTime())); //Usando o formatador sdf para formatar a data, como o formatador recebe uma Date e não um Calendar, preciso usar o método getTime() para fazer a conversão
		
		Date hoje = new Date();
		System.out.println(sdf.format(hoje));
		
		String d = sdf.format(hoje); //transformando em String
		System.out.println(d);
		
		System.out.println();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";
		
		//O parse de String para data pode gerar exceptions, por isso o try-catch
		try {
			Date minhaDataEmDate = sdf1.parse(minhaData); //transformando String em Date atraves do formatador
			System.out.println("Sem formatação:    " + minhaDataEmDate); //imprimindo a Date sem formatar
			System.out.println("Com formatação 1:  " + sdf.format(minhaDataEmDate)); //formatando a Date
			System.out.println("Com formatação 2:  " + sdf1.format(minhaDataEmDate)); //formatando a Date
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
