package com.dafne.threads.teste;

import com.dafne.threads.MinhaThreadRunnable;

public class Aula69_1 {
	
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

		//Quero que ele dê "Programa finalizado somente depois das threads acabarem de rodar, para isso vou rodar uma nova thread dentro do main
		for (int i=0; i<7; i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Programa finalizado");
		
		//Esse exemplo não dá muito certo pois preciso ficar adivinhando quanto tempo precisa dormir para as threads terminarem
	}

}
