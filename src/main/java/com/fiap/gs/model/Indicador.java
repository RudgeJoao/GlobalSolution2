package com.fiap.gs.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Indicador {
	@Id
    private String id;
	@Column(nullable = false)
    private String descricao;
    @ManyToOne(optional = false)
    private Objetivo objetivo;
  
}
