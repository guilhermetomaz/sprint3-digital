package br.com.fiap.greenclass.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.greenclass.model.PrevisaoClima;
import br.com.fiap.greenclass.repository.PrevisaoClimaRepository;

@Service
public class PrevisaoClimaService {

	@Autowired
	private PrevisaoClimaRepository repository;

	public Optional<PrevisaoClima> findByLocal(String local) {
		return repository.findByLocal(local);
	}

}
