package com.dafne.elementos_basicos.teste;

//Aula 63 - Printf
public class Aula63 {
	public static void main(String[] args) {
		
		System.out.printf("Hello %s", "Olá, Mundo!"); // %s - passa a String como ela está
		System.out.println();
		System.out.printf("Hello %S", "Olá, Mundo!"); // %S - passa a String em caixa alta
		System.out.println();
		
		System.out.printf("Hello %c", 'c'); // %c - passa o caracter como ele está
		System.out.println();
		System.out.printf("Hello %C", 'c'); // %C - passa o caracter em caixa alta
		System.out.printf("%n"); //OBS: dentro do printf não é boa prática usar o \n para pular linha, usamos o %n
		
		int valor = -123456789;
		System.out.printf("%d", valor); // %d - para passar inteiros
		System.out.printf("%n");
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante); // %f para passar ponto flutuante
		System.out.printf("%n");
		
		String olaMundo = "Ola Mundo!";
		System.out.printf("%20s", olaMundo); //%20s - coloca 20 espaços antes da String
		System.out.printf("%n");
		
		System.out.printf("%-20s", olaMundo); //%-20s - coloca 20 espaços depois da String
		System.out.printf("%n");
		
		System.out.printf("%+d", valor); // %+d - para passar inteiros com o sinal na frente
		System.out.printf("%n");
		
		System.out.printf("%015d", valor); // %015d - quero um numero de quinze digitos, pego o valor e completo com zeros na frente
		System.out.printf("%n");
		
		System.out.printf("%,d", valor); // %,d - separa os milhares do número por .
		System.out.printf("%n");
		
		System.out.printf("% d", valor); // % d - se o número for negativo imprime o - antes do número, se for positivo imprime um espaço em branco antes do número
		System.out.printf("%n");
		
		System.out.printf("%.3f", pontoFlutuante); // %.3f imprime só 3 casas decimais depois da vírgula
		System.out.printf("%n");
		
		System.out.printf("R$%10.2f", pontoFlutuante); // R$%10.2f imprime o R$ na frente, um número com 10 digitos sendo 2 casas decimais depois da vírgula
		System.out.printf("%n");
		
		testeMaisCompleto();
	}
	
	
	private static void testeMaisCompleto(){
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i=0; i<precos.length; i++){
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
		
		//Na vida real não usamos printf, usamos a classe Java.util.Formater
	}
	
	
}
