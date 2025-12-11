package com.floristeria.v1.Service;

import java.util.List;
import com.floristeria.v1.Model.UsuarioModel;

public interface UsuarioService {

    UsuarioModel guardarUsuario(UsuarioModel usuario);

    List<UsuarioModel> listarUsuarios();

    UsuarioModel obtenerUsuarioPorId(Long id);

    UsuarioModel actualizarUsuario(UsuarioModel usuario);

    void eliminarUsuario(Long id);

    List<UsuarioModel> mostrarTodos();
}
