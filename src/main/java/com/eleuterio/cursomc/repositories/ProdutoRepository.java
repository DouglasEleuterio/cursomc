package com.eleuterio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleuterio.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
