package com.toDo.list.DTO;

import java.time.LocalDate;

import com.toDo.list.entities.Tarefa;
import com.toDo.list.entities.enums.Prioridade;
import com.toDo.list.entities.enums.Status;

public class TarefaDTO {
////////////////////////ENTIDADES//////////////////////////////////
	private Long id;
	private Long idUsuario;
	private String setor;
	private LocalDate dataCadastro;
	private String descricao;
	private Prioridade prioridade;
	private Status status;
////////////////////////FIM ENTIDADES//////////////////////////////////
	
////////////////////////CONSTRUTORES////////////////////////////////// 
	public TarefaDTO() {
		
	}
	
	public TarefaDTO(Long id, Long idUsuario, String setor, LocalDate dataCadastro, String descricao, Prioridade prioridade,
		Status status) {
		
		this.id = id;
		this.idUsuario = idUsuario;
		this.setor = setor;
		this.dataCadastro = dataCadastro;
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.status = status;
}
	public TarefaDTO(Tarefa entity) {
		id = entity.getId();
		idUsuario = entity.getUser().getId();
		setor = entity.getSetor();
		dataCadastro = entity.getDataCadastro();
		prioridade = entity.getPrioridade();
		status = entity.getStatus();
	}
////////////////////////CONSTRUTORES////////////////////////////////// 

///////////////////////////GET E SET//////////////////////////////////
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

///////////////////////////FIM GET E SET//////////////////////////////////

	
}
