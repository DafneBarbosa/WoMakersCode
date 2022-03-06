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
		
		//Ver todos os Locales dispon�veis:
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale loc: locales){
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("C�digo da l�ngua: " + loc.getLanguage());
			System.out.println("L�ngua: " + loc.getDisplayLanguage());
			System.out.println("Cod Pa�s: " + loc.getCountry());
			System.out.println("Pa�s: " + loc.getDisplayCountry());
			System.out.println("*******************");
		}
		
		//Locale default
		Locale locale = Locale.getDefault();	
		System.out.println("Locale Default: " + locale);
		
		//Locale espec�fico
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
