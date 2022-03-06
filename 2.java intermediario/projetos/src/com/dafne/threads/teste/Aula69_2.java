package com.dafne.threads.teste;

import com.dafne.threads.MinhaThreadRunnable;

public class Aula69_2 {
	
	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

		//enquanto as threads 1, 2 e 3 estiverem rodando, a thread principal dorme
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Programa finalizado");
		
		//Esse exemplo até dá certo, mas não está muito bonito, vamos fazer então um terceiro exemplo
	}

}
