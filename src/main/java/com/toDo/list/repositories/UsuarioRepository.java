package com.toDo.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toDo.list.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario,Long> {

}
