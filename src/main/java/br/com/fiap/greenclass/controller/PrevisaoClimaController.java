package br.com.fiap.greenclass.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.greenclass.model.PrevisaoClima;
import br.com.fiap.greenclass.service.PrevisaoClimaService;

@RestController
@RequestMapping("/api/clima")
public class PrevisaoClimaController {

	@Autowired
	private PrevisaoClimaService service;

	@GetMapping
	public ResponseEntity<PrevisaoClima> buscar(@RequestParam String local) {
		Optional<PrevisaoClima> optional = service.findByLocal(local);
		return ResponseEntity.of(optional);
	}

}
