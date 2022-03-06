package com.dafne.strings.teste;

public class Aula76 {
	
	public static void main(String[] args) {
		
		//APRENDENDO A CONCATENAR STRINGS

		String curso = "Curso ";
		String java = "Java";
		String cursoJava = curso + java;
		System.out.println(cursoJava);

		String resultado2Com2 = "Resultado 2+2 = " + (2+2); //concatenando com soma de inteiros
		System.out.println(resultado2Com2); // = Resultado 2+2 = 4

		String resultado2Com2_ = "Resultado 2+2 = " + 2 + 2; //se não colocar parênteses na expressão numérica ele transforma os numero em strings primeiro e depois concatena
		System.out.println(resultado2Com2_); // = Resultado 2+2 = 22

		String um = String.valueOf(1); //transformando inteiro em string através do método valueOf()
		System.out.println(um);

		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
				"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
				"minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " + 
				"commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " + 
				"essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " + 
				"non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		System.out.println(concatenacao);

		//Esse tipo de concatenação é a maneira incorreta, uma vez que as strings no java são IMUTÁVEIS, ou seja, seu valor NÃO MUDA  -->  isso quer dizer que se eu declarar uma String e depois alterar seu valor, eu não estou alterando de fato seu valor, estou criando uma nova String e fazendo com que a referência dessa variável aponte para a nova referência.
		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
		concatenacao2 += "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad ";
		concatenacao2 += "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea ";
		concatenacao2 += "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit ";
		concatenacao2 += "essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat ";
		concatenacao2 += "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		System.err.println(concatenacao2); //err - pinta de vermelho o texto
		
		
	
	}

}
