package com.dafne.estruturadados.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

	public static void main(String[] args) {

		Queue<Integer> fila = new PriorityQueue<Integer>();
		
		fila.add(3);
		fila.add(1);

		
		System.out.println(fila);
		
		Queue<Paciente> fila2 = new PriorityQueue<Paciente>();
		
		fila2.add(new Paciente("A", 2));
		fila2.add(new Paciente("C", 1));
		
		System.out.println(fila2);
		
		fila2.remove();
		System.out.println(fila2);

	}

}
