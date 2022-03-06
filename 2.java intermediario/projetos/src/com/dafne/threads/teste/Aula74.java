package com.dafne.threads.teste;

public class Aula74 {
	
public static void main(String[] args) {
		
		final String RECURSO1 = "Recurso #1";
		final String RECURSO2 = "Recurso #2";
		
		Thread t1 = new Thread() {
			public void run(){
				synchronized (RECURSO1) {
					
					System.out.println("Thread #1: bloqueou recurso 1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread #1: tendando o acesso ao recurso 2");
					synchronized (RECURSO2) { //Thread 1 não consegue entrar pq o recurso2 está bloqueado pela thread 2
						System.out.println("Thread #1: bloqueou recurso 2");
					}
					
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run(){
				synchronized (RECURSO2) {
					
					System.out.println("Thread #2: bloqueou recurso 2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread #2: tendando o acesso ao recurso 1");
					synchronized (RECURSO1) { //Thread 2 não consegue entrar pq o recurso1 está bloqueado pela thread 1
						System.out.println("Thread #2: bloqueou recurso 1");
					}
					
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
