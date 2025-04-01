package com.toDo.list.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDo.list.DTO.TarefaDTO;
import com.toDo.list.entities.Tarefa;
import com.toDo.list.entities.Usuario;
import com.toDo.list.entities.enums.Prioridade;
import com.toDo.list.entities.enums.Status;
import com.toDo.list.repositories.TarefaRepository;
import com.toDo.list.repositories.UsuarioRepository;

@Service
public class TarefaService {
	
	@Autowired
	TarefaRepository tarefaRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public TarefaDTO criarTarefa(TarefaDTO dto) {
		Tarefa tarefa = new Tarefa();
		
		tarefa.setDescricao(dto.getDescricao());
		tarefa.setDataCadastro(LocalDate.now()); //definir data de hoje
		tarefa.setPrioridade(Prioridade.BAIXA); //definir padrão
		tarefa.setSetor(dto.getSetor());
		tarefa.setStatus(Status.A_FAZER); //definir padrão
		
		Usuario user = usuarioRepository.getReferenceById(dto.getIdUsuario());
		tarefa.setUser(user);
		
		tarefa = tarefaRepository.save(tarefa);
		return new TarefaDTO(tarefa);
		
	}
	
	public List<Tarefa> mostrarTarefas(){ //metodo para exibir todas as tarefas no controller
		List<Tarefa> lista = tarefaRepository.findAll();
		return lista;
	}

}
