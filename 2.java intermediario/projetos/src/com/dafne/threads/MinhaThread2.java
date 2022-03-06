package com.dafne.threads;

public class MinhaThread2 implements Runnable {

	private String nome;
	private boolean estaSuspensa;
	private boolean foiTerminada;

	public MinhaThread2(String nome){
		this.nome = nome;
		this.estaSuspensa = false;
		new Thread(this, nome).start();
		//Thread t = new Thread(this, nome);
		//t.start();
	}

	@Override
	public void run() {

		System.out.println("Executando " + this.nome);

		try {
			for (int i=0; i<10; i++){
				System.out.println("Thread " + nome + ", " + i);
				Thread.sleep(300);
				synchronized (this) {  //usando um bloco synchronized para poder usar o wait
					while (estaSuspensa){
						wait();
					}
					if (this.foiTerminada){
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread " + this.nome + " terminada.");
	}
	
	public void suspend(){
		this.estaSuspensa = true;
	}

	public synchronized void resume(){
		this.estaSuspensa = false;
		notify();
	}
	
	public synchronized void stop(){
		this.foiTerminada = true;
		notify();
	}
}
