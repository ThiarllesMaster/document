package com.documentation.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Projeto {

	private String nomeProjeto;
	
	public Projeto() {
	}
	
	public Projeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	
	
}
