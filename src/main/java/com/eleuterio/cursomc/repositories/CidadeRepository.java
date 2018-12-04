package com.eleuterio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleuterio.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
