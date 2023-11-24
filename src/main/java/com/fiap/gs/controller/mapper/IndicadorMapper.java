package com.fiap.gs.controller.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.fiap.gs.controller.dto.IndicadorDTO;
import com.fiap.gs.model.Indicador;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class IndicadorMapper {

	private final ModelMapper modelMapper;

	public IndicadorDTO map(Indicador indicador) {
		IndicadorDTO dto = modelMapper.map(indicador, IndicadorDTO.class);
		dto.setId(indicador.getId());
		dto.setObjetivo_id(indicador.getObjetivo().getId());
		return dto;
	}
}