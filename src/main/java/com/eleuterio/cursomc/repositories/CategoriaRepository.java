package com.eleuterio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleuterio.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
