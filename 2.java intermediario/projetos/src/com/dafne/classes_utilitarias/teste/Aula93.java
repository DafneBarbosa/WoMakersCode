package com.dafne.classes_utilitarias.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93 {
	
	public static void main(String[] args) {
		
		//Trabalhando com datas no Java - LocalDate
		
		LocalDate agora = LocalDate.now(); //data agora - dd MM yyyy
		System.out.println(agora);
		
		System.out.println(LocalDate.of(2019, 2, 1)); //data específica
		System.out.println(LocalDate.parse("2020-02-01")); //parseando data de uma string

		System.out.println(agora.plusDays(30)); //adicionando dias em uma data
		
		System.out.println(agora.minus(1, ChronoUnit.MONTHS)); //diminuindo 1 mês da data agora
		
		System.out.println(agora.getDayOfWeek()); //pegando dia da semana
		System.out.println(agora.getDayOfMonth()); //pegando o dia do mês
		System.out.println(agora.getDayOfYear()); //pegando o dia do ano
		
		System.out.println(LocalDate.parse("2020-02-01").isLeapYear()); //descobrindo se é um ano bissexto
		
		
		LocalTime hAgora = LocalTime.now(); //Hora de agora no formato ISO
		System.out.println(hAgora);
		
		System.out.println(LocalTime.of(20, 18)); //Hora específica
		System.out.println(LocalTime.parse("20:18"));
		
		System.out.println(hAgora.plusMinutes(50)); //Adicionando minutos
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));
		
		System.out.println(hAgora.getHour()); //Somente a hora de agora
		
		// data completa = data + hora
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);
		
		System.out.println(LocalDateTime.of(2019, 2, 16, 20, 25, 10));
		System.out.println(LocalDateTime.parse("2019-02-16T20:25:10"));
		System.out.println(agoraCompleto.plusYears(20));
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		//Ver fusos disponíveis
		/*Set<String> fusos = ZoneId.getAvailableZoneIds();
		for (String f : fusos) {
			System.out.println(f);
		}*/
		
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), sp);
		System.out.println(zdt);
		System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-02:00[America/Sao_Paulo]"));
		
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
		System.out.println(offsetdt);
		
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
	}


}
