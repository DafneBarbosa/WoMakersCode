package com.dafne.threads.teste;

import com.dafne.threads.ThreadTiqueTaque;
import com.dafne.threads.TiqueTaque;

public class Aula72 {
	
	public static void main(String[] args) {
		
		TiqueTaque tt = new TiqueTaque();
		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
		
		try {
			tique.t.join();
			taque.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
