package com.dafne.enumeradores;

public enum TipoDocumento {
	
	CPF {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf(); //chamando o método cpf, da classe GeraCpfCnpj, que gera um numero de cpf randômico
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	//Criando funcao abstrata para gerar o numero do documento
	public abstract String geraNumeroTeste();
}
