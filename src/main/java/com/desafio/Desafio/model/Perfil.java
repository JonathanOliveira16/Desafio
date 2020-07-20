package com.desafio.Desafio.model;

import java.io.Serializable;

public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;
	String nomePerfil;

	public String getNomePerfil() {
		return nomePerfil;
	}

	public void setNomePerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}
	
	public Perfil() {
		
	}

	public Perfil(String nomePerfil) {
		super();
		this.nomePerfil = nomePerfil;
	}
	
	
}
