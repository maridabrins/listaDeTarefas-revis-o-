package com.toDo.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toDo.list.entities.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa , Long> {

}
