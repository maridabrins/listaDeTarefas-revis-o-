package com.toDo.list.DTO;

import com.toDo.list.entities.Usuario;


public class UsuarioDTO {

////////////////////////ENTIDADES//////////////////////////////////
	private Long id;
	private String nome;
	private String email;
////////////////////////FIM ENTIDADES//////////////////////////////////

////////////////////////CONSTRUTORES//////////////////////////////////
	public UsuarioDTO() {
	}

	public UsuarioDTO(Long id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public UsuarioDTO (Usuario entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.email = entity.getEmail();
	}
	
////////////////////////FIM CONSTRUTOR//////////////////////////////////

////////////////////////GET E SET//////////////////////////////////
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	
////////////////////////FIM GET E SET//////////////////////////////////
	
	
	
	
	
}
