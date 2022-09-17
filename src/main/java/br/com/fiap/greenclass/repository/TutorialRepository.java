package br.com.fiap.greenclass.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.greenclass.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

	Optional<Tutorial> findByTitulo(String titulo);

}
