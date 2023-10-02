package com.group.ecommerce.service;

import java.util.Optional;

import com.group.ecommerce.model.Usuario;

public interface IUsuarioService {
	Optional<Usuario> findById(Integer id);
	Usuario save (Usuario usuario);
}
