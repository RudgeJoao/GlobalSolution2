package com.fiap.gs.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.gs.controller.dto.IndicadorDTO;
import com.fiap.gs.controller.dto.ObjetivoDTO;
import com.fiap.gs.controller.mapper.IndicadorMapper;
import com.fiap.gs.controller.mapper.ObjetivoMapper;
import com.fiap.gs.services.IndicadorService;
import com.fiap.gs.services.ObjetivoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/objetivos")
@RequiredArgsConstructor
public class ControllerObjetivo {
	private final ObjetivoService objetivoService;
	private final IndicadorService indicadorService;
	private final ObjetivoMapper objetivoMapper;
	private final IndicadorMapper indicadorMapper;
	
	@GetMapping
	public ResponseEntity<List<ObjetivoDTO>> getAll() {
		List<ObjetivoDTO> result = objetivoService.getAll().stream().map(objetivoMapper::map).collect(Collectors.toList());
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping("{id}/pedidos")
	public ResponseEntity<List<IndicadorDTO>> findPedidosByClienteId(@PathVariable String id) {
		if (!objetivoService.exists(id)) {
			return ResponseEntity.notFound().build();
		}
		List<IndicadorDTO> dto = indicadorService.findByObjetivo(id).stream().map(indicadorMapper::map)
				.collect(Collectors.toList());
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
}
