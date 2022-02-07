package com.dafne.estruturadados.vetor.teste;

import java.util.Objects;

public class Contato {
	
	private String nome;
	private String email;	
	
	public Contato(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Contato() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return email == other.email && Objects.equals(nome, other.nome);
	}
	
	
	

}
