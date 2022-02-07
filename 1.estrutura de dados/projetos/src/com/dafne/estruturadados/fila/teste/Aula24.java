package com.dafne.estruturadados.fila.teste;

import com.dafne.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {
		
		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
		
		fila.enfileira(1);
		fila.enfileira(3);
		fila.enfileira(2);
		
		System.out.println(fila);
		
		FilaComPrioridade<Paciente> fila2 = new FilaComPrioridade<>();
		
		fila2.enfileira(new Paciente("A", 2));
		fila2.enfileira(new Paciente("B", 3));
		fila2.enfileira(new Paciente("C", 1));
		
		System.out.println(fila2);
		
		fila2.desenfileira();
		System.out.println(fila2);
	}

}
