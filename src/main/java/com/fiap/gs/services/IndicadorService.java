package com.fiap.gs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fiap.gs.model.Indicador;
import com.fiap.gs.repositories.IndicadorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IndicadorService {

	private final IndicadorRepository indicadorRepository;
	
	public List<Indicador> getAll() {
		return indicadorRepository.findAll();
	}

	public boolean exists(String id) {
		return indicadorRepository.existsById(id);
	}

	public Indicador findById(String id) {
		return indicadorRepository.findById(id).orElse(null);
	}
	
	public List<Indicador> findByObjetivo(String id) {
		return indicadorRepository.findByObjetivo(id);
	}
}
