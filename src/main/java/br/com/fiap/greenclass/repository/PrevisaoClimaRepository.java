package br.com.fiap.greenclass.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.greenclass.model.PrevisaoClima;

public interface PrevisaoClimaRepository extends JpaRepository<PrevisaoClima, Long> {

	Optional<PrevisaoClima> findByLocal(String local);

}
