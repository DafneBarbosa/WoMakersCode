package com.dafne.elementos_basicos.teste;

public class Aula57 {

	public static void main(String[] args) {
		
		//Tipos primitivos
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		
		float num5 = 3.5f;
		double num6 = 3.55555;
		
		boolean flag = true;
		
		char a = 'a';
		
		//Wrappers - classes que representam tipos primitivos
		Short num7 = new Short((short)1);
		Byte num8 = new Byte((byte)10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double n12 = new Double(3.55555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		Integer num13 = new Integer("100"); //passando em String através do construtor
		Double num14 = new Double("3.555");
		
		System.out.println(num13.byteValue());
		
		int num15 = Integer.parseInt("10000"); //passando em String através do método parseInt
		
		Integer num16 = Integer.valueOf(1343);
		System.out.println(num16);
		
		System.out.println(num9 == num13);
		System.out.println(num13.equals(num9));

	}

}
