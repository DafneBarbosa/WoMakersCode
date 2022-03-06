package com.dafne.elementos_basicos;

public class EscopoVariaveis {

	private int valor; //variável global - atributo

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor){
		valor = valor + 10; //estou modificando somente a variável local
		return valor;
	}

	public int teste(){
		int valor = 5; //criando uma variável local
		if (true){
			valor--; //modifico somente a variável local
		}
		return valor;
	}

	public void outroTeste(){
		for (int i=0; i<10; i++){ //i é uma vriável local, só vale dentro do for
			System.out.println(i);
		}
		//i++; //erro de compilação - i não existe fora do for

		int j; //como declarei o j fora do for, posso acessar ela do lado de fora
		for (j=0; j<10; j++){
			System.out.println(j);
		}
		System.out.println(j); //j tem valor 10
	}

	public void maiUmTeste(){
		boolean flag = true;
		if (flag){
			int umaVariavel = 10;
			umaVariavel++;
			System.out.println(umaVariavel);
		}
		//System.out.println(umaVariavel); //erro de compilação - umaVariavel só exite dentro do if
	}

	public void maiUmOutroTeste(int num){
		int total = 0;
		try {
			int outroNum = 0;
			total = num/outroNum;
		} catch (Exception e){
			e.printStackTrace(); //vai dar exception - divisão por zero
		} finally {
			total++;
			//outroNum++; //erro de compilação - 'outroNum' só vale dentro do try
			//e.printStackTrace(); //erro de compilação - 'e' só vale dentro do catch
		}

		num++;
		//outroNum++; //erro de compilação - 'outroNum' só vale dentro do try
		//e.printStackTrace(); //erro de compilação - 'e' só vale dentro do catch
	}
}
