package com.dafne.classes_utilitarias.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92 {
	
	public static void main(String[] args) {
		
		//Classe TimeZone
		
		Calendar calendar = Calendar.getInstance(); //referenciando um calendario
		TimeZone tz = calendar.getTimeZone(); //referenciando um timezone
		
		System.out.println(tz); // nossa timezone
		
		//TimeZones disponíveis
		/*String[] fusos = TimeZone.getAvailableIDs();
		for (String fuso: fusos) {
			System.out.println(fuso);
		}*/
		
		TimeZone tzNY = TimeZone.getTimeZone("America/New_York"); //Passando um timezone através do ID
		System.out.println(tzNY.getDisplayName());
		System.out.println(tzNY.getID());

		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println("Agora em SP:  " + sdf.format(agora.getTime()));
		
		Calendar agoraNY = Calendar.getInstance(tzNY);
		//System.out.println(agoraNY.getTimeZone());
		//System.out.println("Agora em NY:  " + sdf.format(agoraNY.getTime()));
		
		agoraNY.add(Calendar.HOUR_OF_DAY, tzNY.getOffset((System.currentTimeMillis())) / 1000 / 60/ 60);
		System.out.println("Agora em NY:  " + sdf.format(agoraNY.getTime()));
	}

}
