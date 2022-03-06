package com.dafne.elementos_basicos;

public @interface InformacaoAula {
	
	String autor() default "Dafne Barbosa";
	int aulaNumero();
	String site() default "https://loiane.training";

}
