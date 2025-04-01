package com.toDo.list.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	////////////////////////ENTIDADES//////////////////////////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Column(unique = true) //definir como unico
	private String email;
	
	////////////////////////RELACIONAMENTO////////////////////////////////// 
	@OneToMany(mappedBy = "user")
	private List<Tarefa> tarefas = new ArrayList<>();
	////////////////////////FIM RELACIONAMENTO////////////////////////////////// 
	
	//////////////////////// FIM ENTIDADES//////////////////////////////////
	
	
	////////////////////////CONSTRUTORES//////////////////////////////////
	public Usuario(){
		
	}

	public Usuario(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	////////////////////////FIM CONSTRUTORES//////////////////////////////////

	
	////////////////////////GET SET//////////////////////////////////
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

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	
	
	////////////////////////FIM GET E SET//////////////////////////////////
	
	

}
