package com.dafne.threads.teste;

import com.dafne.threads.MinhaThread;

public class Aula67 {
	public static void main(String[] args) {
		
		//As 3 threads vão ser executadas ao mesmo tempo, como cada um vai ter um tempo de sleep diferente, elas vão andar em passos diferentes
		
		MinhaThread thread = new MinhaThread("Thread #1", 600);
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 900);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);
	}

}
