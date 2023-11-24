package com.fiap.gs.controller.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.fiap.gs.controller.dto.ObjetivoDTO;
import com.fiap.gs.model.Objetivo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ObjetivoMapper {

	private final ModelMapper modelMapper;

	public ObjetivoDTO map(Objetivo objetivo) {
		ObjetivoDTO dto = modelMapper.map(objetivo, ObjetivoDTO.class);
		dto.setId(objetivo.getId());
		return dto;
	}
}