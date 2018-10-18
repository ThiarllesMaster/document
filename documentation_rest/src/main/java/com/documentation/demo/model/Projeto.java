package com.documentation.demo.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Projeto {

	@NotNull
	@Size(min = 10, max = 20, message = "O nome do projeto deve ter entre 10 e 20 caracteres")
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
