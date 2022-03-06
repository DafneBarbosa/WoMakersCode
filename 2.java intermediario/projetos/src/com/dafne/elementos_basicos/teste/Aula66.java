package com.dafne.elementos_basicos.teste;

import com.dafne.elementos_basicos.Contato;

public class Aula66 {

	public static void obterMemoriaUsada(){
		
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime(); //padrão singleton - só posso ter uma instância da classe
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
		
	}

	public static void main(String[] args) {
		
		Contato[] contatos = new Contato[1000000];
		Contato contato;

		for (int i=0; i<contatos.length; i++){
			contato = new Contato("Contato"+i, "1234-56789"+i, "contato"+i+"@email.com");
			contatos[i] = contato;
		}
		
		System.out.println("Contatos criados");
		
		obterMemoriaUsada();
		
		contatos = null;
		
		Runtime.getRuntime().runFinalization(); //finalizando os objetos
		
		Runtime.getRuntime().gc(); //chamando o garbage collector, mas não é garantido que ele será executado
		
		System.out.println("Contatos removidos da memória");
		
		obterMemoriaUsada();
	}
	
}
