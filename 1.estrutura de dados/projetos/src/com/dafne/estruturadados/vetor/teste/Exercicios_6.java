package com.dafne.estruturadados.vetor.teste;

import java.util.Scanner;

import com.dafne.estruturadados.vetor.Lista;

public class Exercicios_6 {
	public static void main(String[] args) {
		
		//criação das variáveis
		Scanner scan = new Scanner(System.in);
		
		//criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista(20);
		
		//criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);
		
		//1-criar um menu de opções para o usuário
		int opcao = 1;
		
		while(opcao!=0) {
			opcao = obterOpcaoMenu(scan);
			
			switch(opcao) {
			case 1:
				adicionarContatoFinal(scan,lista);
				break;
			case 2:
				adicionarContatoPosicao(scan,lista);
				break;
			case 3:
				obtemContatoPosicao(scan,lista);
				break;
			case 4:
				obtemContato(scan,lista);
				break;
			case 5:
				pesquisarUltimoIndice(scan,lista);
				break;
			case 6:
				pesquisarContatoExiste(scan,lista);
				break;
			case 7:
				excluirPorPosicao(scan,lista);
				break;
			case 8:
				excluirContato(scan,lista);
				break;
			case 9:
				imprimeTamanhoLista(lista);
				break;
			case 10:
				excluirTodosContatos(lista);
				break;
			case 11:
				imprimeLista(lista);
				break;
			default:
				break;
			}
		}
		
		System.out.println("Usuário digitou zero, programa terminado.");
		
		
	}
	
	private static void imprimeLista(Lista<Contato> lista) {
		System.out.println("Lista de Contatos: "+ lista);
	}

	private static void excluirTodosContatos(Lista<Contato> lista) {
		lista.limpar();
		System.out.println("Todos os contatos foram excluídoscom sucesso!");
	}
	
	private static void imprimeTamanhoLista(Lista<Contato> lista) {
		System.out.println("O tamanho da lista de contatos é: "+lista.tamanho());
	}
	
	private static void excluirContato(Scanner scan, Lista<Contato> lista) {
		System.out.println("Excluiendo um contato, entre com as informações:");
		
		int posicao = leInformacaoInt("Entre com a posição na qual deseja excluir o contato: ",scan);
		
		try {
			Contato contato = lista.busca(posicao);
			System.out.println("Contato a ser excluido	-	"+contato);
			lista.remove(contato);
			System.out.println("Contato excluído com sucesso");
		} catch(Exception e) {
			System.out.println("Posicao inválida, contato não encontrado.");
		}
	}
	
	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {
		System.out.println("Excluiendo um contato, entre com as informações:");
		
		int posicao = leInformacaoInt("Entre com a posição na qual deseja excluir o contato: ",scan);
		
		try {
			lista.remove(posicao);
			System.out.println("Contato excluído com sucesso");
		} catch(Exception e) {
			System.out.println("Posicao inválida, contato não encontrado.");
		}
	}
	
	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {
		System.out.println("Buscando um contato, entre com as informações:");
		
		int posicao = leInformacaoInt("Entre com a posição na qual deseja buscar o contato: ",scan);
		
		try {
			Contato contato = lista.busca(posicao);
			System.out.println("Contato encontrado com sucesso	-	"+contato);
			
			boolean existe = lista.contem(contato);
			System.out.println("O contato existe: "+existe);
		} catch(Exception e) {
			System.out.println("Posicao inválida, contato não encontrado.");
		}
	}
	
	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
		System.out.println("Buscando um contato, entre com as informações:");
		
		int posicao = leInformacaoInt("Entre com a posição na qual deseja buscar o contato: ",scan);
		
		try {
			Contato contato = lista.busca(posicao);
			System.out.println("Contato encontrado com sucesso	-	"+contato);
			
			posicao = lista.ultimoIndice(contato);
			System.out.println("Última posição do contato: "+posicao);
		} catch(Exception e) {
			System.out.println("Posicao inválida, contato não encontrado.");
		}
	}
	
	private static void obtemContato(Scanner scan, Lista<Contato> lista) {
		System.out.println("Buscando um contato, entre com as informações:");
		
		int posicao = leInformacaoInt("Entre com a posição na qual deseja buscar o contato: ",scan);
		
		try {
			Contato contato = lista.busca(posicao);
			System.out.println("Contato encontrado com sucesso	-	"+contato);
			
			posicao = lista.busca(contato);
			System.out.println("Contato encontrado na posição: "+posicao);
		} catch(Exception e) {
			System.out.println("Posicao inválida, contato não encontrado.");
		}
	}
	
	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
		System.out.println("Buscando um contato, entre com as informações:");
		
		int posicao = leInformacaoInt("Entre com a posição na qual deseja buscar o contato: ",scan);
		
		try {
			Contato contato = lista.busca(posicao);
			System.out.println("Contato encontrado com sucesso	-	"+contato);
		} catch(Exception e) {
			System.out.println("Posicao inválida, contato não encontrado.");
		}
	}
	
	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o nome: ", scan);
		String email = leInformacao("Entre com o email: ", scan);
		
		Contato contato = new Contato(nome, email);
		lista.adiciona(contato);
		System.out.println("Contato adicionado com sucesso	-	"+contato);
	}
	
	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o nome: ", scan);
		String email = leInformacao("Entre com o email: ", scan);
		Contato contato = new Contato(nome, email);
		
		int posicao = leInformacaoInt("Entre com a posição na qual deseja adicionar o contato: ",scan);
		
		try {
			lista.adiciona(posicao,contato);
			System.out.println("Contato adicionado com sucesso	-	"+contato);
		} catch(Exception e) {
			System.out.println("Posicao inválida, contato não adicionado.");
		}
	}
	
	protected static String leInformacao(String msg, Scanner scan) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}
	
	protected static int leInformacaoInt(String msg, Scanner scan) {
		boolean entradaValida = false;
		int num = 0;
		while(!entradaValida) {
			try {
				System.out.println(msg);
				String entrada = scan.nextLine();
				num = Integer.parseInt(entrada);
				entradaValida = true;
			} catch(Exception e) {
				System.out.println("Numero inválido, digite novamente");
			}
			
		}		
		return num;
	}
	
	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
		Contato contato;	//melhor declarar a variável fora do loop para não criar várias variáveis
		for(int i=1; i<=quantidade; i++) {
			contato = new Contato();	//e dentro do loop só instanciamos a variável
			contato.setNome("Contato "+i);
			contato.setEmail("contato"+i+"@gmail.com");
			
			lista.adiciona(contato);
		}
	}
	
	protected static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 0;
		String entrada;
		
		while(!entradaValida) {
			System.out.println("\nDigite a opção desejada: ");
			System.out.println("1: adiciona contato no final da lista");
			System.out.println("2: adiciona contato em uma posição específica");
			System.out.println("3: busca contato de uma posição específica");
			System.out.println("4: busca a posição de um contato específico");
			System.out.println("5: consulta último índice de um contato");
			System.out.println("6: verifica se contato existe");
			System.out.println("7: excluir contato por posição");
			System.out.println("8: excluir contato");
			System.out.println("9: verifica tamanho da lista");
			System.out.println("10: excluir todos os contatos do vetor");
			System.out.println("11: imprime lista");
			System.out.println("0: sair");
			
			try {
				entrada = scan.nextLine(); 	//pegando a resposta do usuário
				opcao = Integer.parseInt(entrada);	//trasformando a resposta do usuário em inteiro
				if(opcao>=0 && opcao<=11) {	
					entradaValida = true;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {	//Se o usuário não digitar um inteiro, ou um numero invalido, cai em uma excessão
				System.out.println("Entrada inválida, digite novamente\n\n");
			}	
		}
		return opcao;
	}
	
	
}
