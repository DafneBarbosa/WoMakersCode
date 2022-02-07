package com.dafne.estruturadados.vetor.teste;

import java.util.ArrayList;
import java.util.Scanner;



public class Exercicios_7 extends Exercicios_6{

	public static void main(String[] args) {

		// cria��o das vari�veis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList(20);

		// criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);

		// 1-criar um menu de op��es para o usu�rio
		int opcao = 1;

		while (opcao != 0) {
			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				obtemContatoPosicao(scan, lista);
				break;
			case 4:
				obtemContato(scan, lista);
				break;
			case 5:
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6:
				pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				imprimeTamanhoArrayList(lista);
				break;
			case 10:
				excluirTodosContatos(lista);
				break;
			case 11:
				imprimeArrayList(lista);
				break;
			default:
				break;
			}
		}

		System.out.println("Usu�rio digitou zero, programa terminado.");

	}
			
	private static void imprimeArrayList(ArrayList<Contato> lista) {
		System.out.println("ArrayList de Contatos: " + lista);
	}

	private static void excluirTodosContatos(ArrayList<Contato> lista) {
		lista.clear();
		System.out.println("Todos os contatos foram exclu�doscom sucesso!");
	}

	private static void imprimeTamanhoArrayList(ArrayList<Contato> lista) {
		System.out.println("O tamanho da lista de contatos �: " + lista.size());
	}

	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Excluiendo um contato, entre com as informa��es:");

		int posicao = leInformacaoInt("Entre com a posi��o na qual deseja excluir o contato: ", scan);

		try {
			Contato contato = lista.get(posicao);
			System.out.println("Contato a ser excluido	-	" + contato);
			lista.remove(contato);
			System.out.println("Contato exclu�do com sucesso");
		} catch (Exception e) {
			System.out.println("Posicao inv�lida, contato n�o encontrado.");
		}
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Excluiendo um contato, entre com as informa��es:");

		int posicao = leInformacaoInt("Entre com a posi��o na qual deseja excluir o contato: ", scan);

		try {
			lista.remove(posicao);
			System.out.println("Contato exclu�do com sucesso");
		} catch (Exception e) {
			System.out.println("Posicao inv�lida, contato n�o encontrado.");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Buscando um contato, entre com as informa��es:");

		int posicao = leInformacaoInt("Entre com a posi��o na qual deseja buscar o contato: ", scan);

		try {
			Contato contato = lista.get(posicao);
			System.out.println("Contato encontrado com sucesso	-	" + contato);

			boolean existe = lista.contains(contato);
			System.out.println("O contato existe: " + existe);
		} catch (Exception e) {
			System.out.println("Posicao inv�lida, contato n�o encontrado.");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Buscando um contato, entre com as informa��es:");

		int posicao = leInformacaoInt("Entre com a posi��o na qual deseja buscar o contato: ", scan);

		try {
			Contato contato = lista.get(posicao);
			System.out.println("Contato encontrado com sucesso	-	" + contato);

			posicao = lista.lastIndexOf(contato);
			System.out.println("�ltima posi��o do contato: " + posicao);
		} catch (Exception e) {
			System.out.println("Posicao inv�lida, contato n�o encontrado.");
		}
	}

	private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Buscando um contato, entre com as informa��es:");

		int posicao = leInformacaoInt("Entre com a posi��o na qual deseja buscar o contato: ", scan);

		try {
			Contato contato = lista.get(posicao);
			System.out.println("Contato encontrado com sucesso	-	" + contato);

			posicao = lista.indexOf(contato);
			System.out.println("Contato encontrado na posi��o: " + posicao);
		} catch (Exception e) {
			System.out.println("Posicao inv�lida, contato n�o encontrado.");
		}
	}

	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Buscando um contato, entre com as informa��es:");

		int posicao = leInformacaoInt("Entre com a posi��o na qual deseja buscar o contato: ", scan);

		try {
			Contato contato = lista.get(posicao);
			System.out.println("Contato encontrado com sucesso	-	" + contato);
		} catch (Exception e) {
			System.out.println("Posicao inv�lida, contato n�o encontrado.");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informa��es:");
		String nome = leInformacao("Entre com o nome: ", scan);
		String email = leInformacao("Entre com o email: ", scan);

		Contato contato = new Contato(nome, email);
		lista.add(contato);
		System.out.println("Contato adicionado com sucesso	-	" + contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informa��es:");
		String nome = leInformacao("Entre com o nome: ", scan);
		String email = leInformacao("Entre com o email: ", scan);
		Contato contato = new Contato(nome, email);

		int posicao = leInformacaoInt("Entre com a posi��o na qual deseja adicionar o contato: ", scan);

		try {
			lista.add(posicao, contato);
			System.out.println("Contato adicionado com sucesso	-	" + contato);
		} catch (Exception e) {
			System.out.println("Posicao inv�lida, contato n�o adicionado.");
		}
	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
		Contato contato; // melhor declarar a vari�vel fora do loop para n�o criar v�rias vari�veis
		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato(); // e dentro do loop s� instanciamos a vari�vel
			contato.setNome("Contato " + i);
			contato.setEmail("contato" + i + "@gmail.com");

			lista.add(contato);
		}
	}

	

}
