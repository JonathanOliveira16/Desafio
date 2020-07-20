package com.desafio.Desafio.model;

import java.io.Serializable;

public class Cargo implements Serializable {

	private static final long serialVersionUID = 1L;
	String nomeCargo;

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}
	
	public Cargo() {
		
	}

	public Cargo(String nomeCargo) {
		super();
		this.nomeCargo = nomeCargo;
	}



	

	
}
