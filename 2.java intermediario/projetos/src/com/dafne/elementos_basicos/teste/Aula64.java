package com.dafne.elementos_basicos.teste;

import com.dafne.elementos_basicos.Externa;
import com.dafne.elementos_basicos.Externa2;
import com.dafne.elementos_basicos.Externa.Interna;

public class Aula64 {

	public static void main(String[] args) {

		Externa externa = new Externa();
		Interna interna = externa.new Interna(); //para instanciar uma classe interna, preciso já ter uma instancia da classe externa
		interna.imprimeTexto();
		
		Externa2 externa2 = new Externa2();
		externa2.metodoQualquer(); //a classe local está dentro do metodoQualquer

	}

}
