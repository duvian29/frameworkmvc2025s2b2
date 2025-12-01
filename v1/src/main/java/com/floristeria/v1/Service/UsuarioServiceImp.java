package com.floristeria.v1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.floristeria.v1.Model.UsuarioModel;
import com.floristeria.v1.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<UsuarioModel> mostrarTodos() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<UsuarioModel> mostrarPorId(Long id) {
        return usuarioRepository.findById(id);
    }
}
