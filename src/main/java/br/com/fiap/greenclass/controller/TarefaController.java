package br.com.fiap.greenclass.controller;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.greenclass.model.Tarefa;
import br.com.fiap.greenclass.service.TarefaService;

@RestController
@RequestMapping("/api/tarefa")
public class TarefaController {

	@Autowired
	private TarefaService service;

	@GetMapping
	public Page<Tarefa> listar(@PageableDefault(size = 10, sort = "id") Pageable pageable) {
		return service.findAll(pageable);
	}

	@GetMapping("{id}")
	public ResponseEntity<Tarefa> buscar(@PathVariable Long id) {
		Optional<Tarefa> optional = service.findById(id);
		return ResponseEntity.of(optional);
	}

	@PostMapping
	public ResponseEntity<Tarefa> create(@RequestBody Tarefa tarefa) {
		service.save(tarefa);
		return ResponseEntity.status(HttpStatus.CREATED).body(tarefa);
	}

	@PutMapping("{id}")
	public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @RequestBody Tarefa newTarefa) {
		Optional<Tarefa> optional = service.findById(id);

		if (optional.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		Tarefa tarefa = service.findById(id).get();
		BeanUtils.copyProperties(newTarefa, tarefa);
		tarefa.setId(id);
		service.save(tarefa);
		return ResponseEntity.ok(tarefa);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Object> apagar(@PathVariable Long id) {
		Optional<Tarefa> optional = service.findById(id);

		if (optional.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		service.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
