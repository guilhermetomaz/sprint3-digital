package br.com.fiap.greenclass.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.fiap.greenclass.model.Tarefa;
import br.com.fiap.greenclass.repository.TarefaRepository;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository repository;

	public Page<Tarefa> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	public Optional<Tarefa> findById(Long id) {
		return repository.findById(id);
	}

	public Tarefa save(Tarefa tarefa) {
		return repository.save(tarefa);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
