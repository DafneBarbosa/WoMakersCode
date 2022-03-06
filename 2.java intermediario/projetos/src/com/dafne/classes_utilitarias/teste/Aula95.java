package com.dafne.classes_utilitarias.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95 {
	
	public static void main(String[] args) {
		
		//Aprendendo ResourceBundle
		
		System.out.println("Locale atual " + Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto"); //lendo o arquivo meu-texto (est� na src)
		
		System.out.println("Hello pt_BR: " + rb.getString("hello"));
		System.out.println("World pt_BR: " + rb.getString("world"));
		
		Locale.setDefault(new Locale("en_US", "en_US"));
		rb = ResourceBundle.getBundle("meu-texto", new Locale("en_US", "en_US")); //lendo o arquivo meu-texto_en_US (est� na src)
		
		System.out.println("Ol� en_US: " + rb.getString("hello"));
		System.out.println("Mundo en_US: " + rb.getString("world"));
	}


}
