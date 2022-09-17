package br.com.fiap.greenclass.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.greenclass.model.Tutorial;
import br.com.fiap.greenclass.service.TutorialService;

@RestController
@RequestMapping("/api/tutorial")
public class TutorialController {

	@Autowired
	private TutorialService service;
	
	@GetMapping
	public ResponseEntity<Tutorial> buscar(@RequestParam String titulo) {
		Optional<Tutorial> optional = service.findByTitulo(titulo);
		return ResponseEntity.of(optional);
	}
	
}
