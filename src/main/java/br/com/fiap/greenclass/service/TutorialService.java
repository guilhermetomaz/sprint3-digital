package br.com.fiap.greenclass.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.greenclass.model.Tutorial;
import br.com.fiap.greenclass.repository.TutorialRepository;

@Service
public class TutorialService {

	@Autowired
	private TutorialRepository repository;

	public Optional<Tutorial> findByTitulo(String titulo) {
		return repository.findByTitulo(titulo);
	}

}
