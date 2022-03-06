package com.dafne.elementos_basicos;

public class EscopoVariaveis {

	private int valor; //vari�vel global - atributo

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor){
		valor = valor + 10; //estou modificando somente a vari�vel local
		return valor;
	}

	public int teste(){
		int valor = 5; //criando uma vari�vel local
		if (true){
			valor--; //modifico somente a vari�vel local
		}
		return valor;
	}

	public void outroTeste(){
		for (int i=0; i<10; i++){ //i � uma vri�vel local, s� vale dentro do for
			System.out.println(i);
		}
		//i++; //erro de compila��o - i n�o existe fora do for

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
		//System.out.println(umaVariavel); //erro de compila��o - umaVariavel s� exite dentro do if
	}

	public void maiUmOutroTeste(int num){
		int total = 0;
		try {
			int outroNum = 0;
			total = num/outroNum;
		} catch (Exception e){
			e.printStackTrace(); //vai dar exception - divis�o por zero
		} finally {
			total++;
			//outroNum++; //erro de compila��o - 'outroNum' s� vale dentro do try
			//e.printStackTrace(); //erro de compila��o - 'e' s� vale dentro do catch
		}

		num++;
		//outroNum++; //erro de compila��o - 'outroNum' s� vale dentro do try
		//e.printStackTrace(); //erro de compila��o - 'e' s� vale dentro do catch
	}
}
