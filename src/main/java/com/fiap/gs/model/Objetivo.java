package com.fiap.gs.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Objetivo {
	@Id
    private String id;
}
