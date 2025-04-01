package com.toDo.list.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDo.list.DTO.UsuarioDTO;
import com.toDo.list.entities.Usuario;
import com.toDo.list.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public UsuarioDTO criarUser(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
		
		usuario.setEmail(dto.getEmail());
		usuario.setNome(dto.getNome());
		
		usuario = usuarioRepository.save(usuario); //salvando usuario
		
		return new UsuarioDTO(usuario);
				
	}
}
