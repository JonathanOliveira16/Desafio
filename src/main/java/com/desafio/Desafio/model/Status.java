package com.desafio.Desafio.model;

import java.io.Serializable;

public class Status implements Serializable {

	private static final long serialVersionUID = 1L;
	String nomeStatus;

	public String getNomeStatus() {
		return nomeStatus;
	}

	public void setNomeStatus(String nomeStatus) {
		this.nomeStatus = nomeStatus;
	}
	
	public Status() {
		
	}

	public Status(String nomeStatus) {
		super();
		this.nomeStatus = nomeStatus;
	}
	
	
}
