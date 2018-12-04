package com.eleuterio.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eleuterio.cursomc.domain.Categoria;
import com.eleuterio.cursomc.repositories.CategoriaRepository;
import com.eleuterio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException(
					"Objeto nao encontrado Id: " + id + ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}
}
