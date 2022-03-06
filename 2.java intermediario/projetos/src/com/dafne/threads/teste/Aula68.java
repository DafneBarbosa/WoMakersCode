package com.dafne.threads.teste;

import com.dafne.threads.MinhaThreadRunnable;

public class Aula68 {
	
	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);
		//Thread t1 = new Thread(thread1); //posso usar o costrutor da Thread passando uma Runnable
		//t1.start(); // posso colocar isso dentro do construtor da Runnable
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 650);
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);
	}


}
