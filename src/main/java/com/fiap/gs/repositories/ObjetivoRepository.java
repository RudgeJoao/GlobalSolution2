package com.fiap.gs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.gs.model.Objetivo;

@Repository
public interface ObjetivoRepository extends JpaRepository<Objetivo, String>{

}
