package br.com.fiap.greenclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.greenclass.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}
