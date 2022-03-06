package com.dafne.elementos_basicos.teste;

import static java.lang.Math.pow; //Static Import do método específico pow
import static java.lang.Math.*; //Static import de todos os métodos da classe Math - não é tão elegante

public class Aula59 {
	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;
		
		//sem o static import
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));
		
		//com o static import
		System.out.println(pow(a,b));
		System.out.println(sqrt(c));
		
		
	}
}
