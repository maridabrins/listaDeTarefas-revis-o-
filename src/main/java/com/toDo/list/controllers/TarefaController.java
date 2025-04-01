package com.toDo.list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toDo.list.DTO.TarefaDTO;
import com.toDo.list.entities.Tarefa;
import com.toDo.list.services.TarefaService;

import jakarta.validation.Valid;

@RequestMapping ("tarefa")
@RestController
public class TarefaController {
	
	@Autowired
	TarefaService tarefaService;
	
	@PostMapping(value ="/criar")
	public ResponseEntity<TarefaDTO> criarTarefa(@Valid @RequestBody TarefaDTO dto) { //@valid vem da dependencia do validation
		dto = tarefaService.criarTarefa(dto);
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<Tarefa>> buscarTarefa(){ //criando lista de tarefas
		return ResponseEntity.ok(tarefaService.mostrarTarefas()); //retornando lista de tarefa
	}


}
