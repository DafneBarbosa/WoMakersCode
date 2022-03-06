package com.dafne.elementos_basicos.teste;

public class Aula58 {

	public static void main(String[] args) {
		
		//autoboxing - trasformando primitivo em objeto
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 10000l;
		Float num11 = 3.5f;
		Double n12 = 3.55555;
		Boolean flag2 = true;
		Character b = 'b';
		
		//auto un-boxing - transformando um tipo objeto em um tipo primitivo novamente
		int num13 = num9; //=num9.intValue();
		
		num9++;
		
		Integer num14 = num13/num9; //auto unboxing do num 9 -> autoboxing (num13/num9) -> num14
		
		//Mau uso:
		Double x,y,z;
		x = 10.0;
		y = 12.2;
		z = 4.7;
		Double media = (x+y+z)/3; //quando for usar expressoes melhor usar tipos primitivos diretos, pois aqui estou fazendo o auto unboxing dos tipos objetos x, y e z para poder calcular a expressão e aí depois faço o autoboxing para ter a media.
		

	}

}
