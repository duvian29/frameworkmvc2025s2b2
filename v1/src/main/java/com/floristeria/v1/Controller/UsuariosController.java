package com.floristeria.v1.Controller;

import com.floristeria.v1.Service.UsuarioServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    UsuarioServiceImp usuarioServiceImp;

    @RequestMapping("/listar")
    public String listarUsuarios(Model model) {

        model.addAttribute("usuarios", usuarioServiceImp.mostrarTodos());

        return "usuarios/listarusuarios";
    }
}