package com.floristeria.v1.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floristeria.v1.Model.UsuarioModel;
import com.floristeria.v1.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<UsuarioModel> listarUsuarios() {
        return (List<UsuarioModel>) usuarioRepository.findAll();
    }

    @Override
    public UsuarioModel obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public UsuarioModel actualizarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<UsuarioModel> mostrarTodos() {
        return usuarioRepository.findAll();
    }
}
