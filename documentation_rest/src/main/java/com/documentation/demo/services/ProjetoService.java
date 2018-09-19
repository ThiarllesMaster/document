package com.documentation.demo.services;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.documentation.demo.model.Projeto;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
public class ProjetoService {
	
	@RequestMapping(path = "/v1/projeto/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Value", notes = "Este serviço foi desenvolvido para retornar um projeto da base de dados")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Não existe o projeto na base de dados")})
	public Projeto buscarProjeto(@PathVariable("id") Long idProjeto) {
		return new Projeto("UPoem");
	}
	
	@RequestMapping(path = "/v1/projeto", method = RequestMethod.POST)
	@ApiOperation(value = "Value", notes = "Este serviço foi desenvolvido para cadastrar um projeto da base de dados")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Não existe o projeto na base de dados")})
	public Projeto cadastrarProjeto(@RequestBody Projeto projeto) {
		return new Projeto("UPoem");
	}
	
	@RequestMapping(path = "/v1/projeto/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Value", notes = "Este serviço foi desenvolvido para remover um projeto da base de dados")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Não foi possiível remover o projeto na base de dados")})
	public Projeto removerProjeto(@RequestBody Projeto projeto) {
		return new Projeto("UPoem");
	}
	
	@RequestMapping(path = "/v1/projeto/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Value", notes = "Este serviço foi desenvolvido para atualizar um projeto da base de dados")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Não foi possiível atualizar o projeto na base de dados")})
	public Projeto atualizarProjeto(@RequestBody Projeto projeto) {
		return new Projeto("UPoem");
	}
	
}
