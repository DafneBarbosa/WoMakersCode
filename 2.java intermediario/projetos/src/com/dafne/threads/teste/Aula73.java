package com.dafne.threads.teste;

import com.dafne.threads.MinhaThread2;

public class Aula73 {
	
	public static void main(String[] args) {

		//Criando as threads
		MinhaThread2 t1 = new MinhaThread2("#1");
		MinhaThread2 t2 = new MinhaThread2("#2");
		
		System.out.println("Pausando a Thread #1");
		t1.suspend();
		
		try { //tempo de espera do programa - threads continuam rodando
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Pausando a Thread #2");
		t2.suspend();
		
		System.out.println("Resumindo a Thread #1");
		t1.resume();
		
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resumindo a Thread #2");
		t2.resume();
		
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Terminando a Thread #2");
		t2.stop();
	}

}
