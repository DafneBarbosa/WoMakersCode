package com.dafne.elementos_basicos;


public class Externa {
	
	private String texto = "texto externo";
	
	public class Interna{ //Classe aninhada interna
		
		private String texto = "texto interno";
		
		public void imprimeTexto(){
			System.out.println(texto);
			System.out.println(Externa.this.texto); //consegue ver membros da classe externa
		}
	}

}
