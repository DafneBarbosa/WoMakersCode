package com.dafne.enumeradores.teste;

import com.dafne.enumeradores.Pessoa;
import com.dafne.enumeradores.TipoDocumento;

public class Aula56 {
	public static void main(String[] args) {
		
		//Verificando se o enum está funcionando direito
		for(TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc + " - " + doc.geraNumeroTeste());
		}
		
		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(TipoDocumento.CPF);
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
		System.out.println(pf);
		
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(TipoDocumento.CNPJ);
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj);
	}
}
