package com.dafne.classes_utilitarias.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90 {
	
	public static void main(String[] args) {
		
		//Classe Locale
		
		//Brasil  -->   dd/MM/yyyy / 02/01/2000
		//EUA     -->   MM/dd/yyyy / 01-fev/2000
		
		//Brasil  -->   1.000,02
		//EUA     -->   1,000.02
		
		//Ver todos os Locales disponíveis:
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale loc: locales){
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Código da língua: " + loc.getLanguage());
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("Cod País: " + loc.getCountry());
			System.out.println("País: " + loc.getDisplayCountry());
			System.out.println("*******************");
		}
		
		//Locale default
		Locale locale = Locale.getDefault();	
		System.out.println("Locale Default: " + locale);
		
		//Locale específico
		Locale br = new Locale("pt", "Brazil");
		System.out.println(br);
		Locale.setDefault(br); //setando como default
		System.out.println(Locale.getDefault());
		
		//Formatando valores
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000000d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(5000000000d));

	}


}
