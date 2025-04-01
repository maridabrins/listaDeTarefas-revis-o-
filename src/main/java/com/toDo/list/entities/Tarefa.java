package com.toDo.list.entities;

import java.time.LocalDate;

import com.toDo.list.entities.enums.Prioridade;
import com.toDo.list.entities.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tarefa {
	
////////////////////////ENTIDADES//////////////////////////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long idUsuario;
	private String setor;
	private LocalDate dataCadastro;
	private String descricao;
	private Prioridade prioridade;
	private Status status;
	
////////////////////////RELACIONAMENTO//////////////////////////////////
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name="usuario_id")
	private Usuario user;
///////////////////////////FIM RELACIONAMENTO//////////////////////////////////
	
////////////////////////FIM ENTIDADES//////////////////////////////////

///////////////////////////CONSTRUTORES//////////////////////////////////
	public Tarefa() {
		
	}
	
	public Tarefa(Long id, Long idUsuario, String setor, LocalDate dataCadastro, String descricao, Prioridade prioridade,
		Status status, Usuario user) {
	
	this.id = id;
	this.idUsuario = idUsuario;
	this.setor = setor;
	this.dataCadastro = dataCadastro;
	this.descricao = descricao;
	this.prioridade = prioridade;
	this.status = status;
	this.user = user;
}
///////////////////////////FIM CONSTRUTORES//////////////////////////////////

/////////////////////////////////GET E SETTER//////////////////////////////////

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
/////////////////////////////////FIM GET E SETTER//////////////////////////////////

}
