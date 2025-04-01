package com.toDo.list.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toDo.list.DTO.UsuarioDTO;
import com.toDo.list.services.UsuarioService;

import jakarta.validation.Valid;

@RequestMapping("usuario")
@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping(value ="/criar")
	public ResponseEntity<UsuarioDTO> criarUsuario (@Valid @RequestBody UsuarioDTO dto) {
		dto = usuarioService.criarUser(dto);
		return ResponseEntity.ok(dto);
	}

}
