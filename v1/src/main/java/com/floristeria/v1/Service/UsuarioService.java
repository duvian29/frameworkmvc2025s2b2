package com.floristeria.v1.Service;

import java.util.List;
import java.util.Optional;

import com.floristeria.v1.Model.UsuarioModel;

public interface UsuarioService {
    List<UsuarioModel> mostrarTodos();
    Optional<UsuarioModel> mostrarPorId(Long id);
}
