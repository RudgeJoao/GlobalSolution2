package com.fiap.gs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fiap.gs.model.Objetivo;
import com.fiap.gs.repositories.ObjetivoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ObjetivoService {

	private final ObjetivoRepository objetivoRepository;

	public List<Objetivo> getAll() {
		return objetivoRepository.findAll();
	}

	public boolean exists(String id) {
		return objetivoRepository.existsById(id);
	}

	public Objetivo findById(String id) {
		return objetivoRepository.findById(id).orElse(null);
	}
}
