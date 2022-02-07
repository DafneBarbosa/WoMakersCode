package com.dafne.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList();
		
		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		arrayList.add(1, "F");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		System.out.println("Existe a no array? "+arrayList.contains("a"));
		System.out.println("Existe A no array? "+arrayList.contains("A"));
		
		System.out.println("Posição do F: "+arrayList.indexOf("F"));
		
		System.out.println("Elemento na posição 2: "+arrayList.get(2));
		
		arrayList.remove(1);
		System.out.println(arrayList);
		
		arrayList.remove("A");
		System.out.println(arrayList);
		
		System.out.println(arrayList.lastIndexOf("A"));
		
	}

}
