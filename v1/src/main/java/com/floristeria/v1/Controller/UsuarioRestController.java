package com.floristeria.v1.Controller;

import com.floristeria.v1.Model.UsuarioModel;
import com.floristeria.v1.Service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@Tag(name = "Usuarios", description = "Operaciones CRUD para usuarios")
public class UsuarioRestController {

    @Autowired
    private UsuarioService usuarioService;

    @Operation(summary = "Crear un usuario")
    @ApiResponse(responseCode = "200", description = "Usuario creado correctamente")
    @PostMapping
    public UsuarioModel crear(@RequestBody UsuarioModel usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    @Operation(summary = "Listar todos los usuarios")
    @ApiResponse(responseCode = "200", description = "Lista obtenida correctamente")
    @GetMapping
    public List<UsuarioModel> listar() {
        return usuarioService.listarUsuarios();
    }

    @Operation(summary = "Obtener usuario por ID")
    @ApiResponse(responseCode = "200", description = "Usuario encontrado")
    @ApiResponse(responseCode = "404", description = "Usuario no encontrado")
    @GetMapping("/{id}")
    public UsuarioModel obtener(@PathVariable Long id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @Operation(summary = "Actualizar usuario")
    @ApiResponse(responseCode = "200", description = "Usuario actualizado")
    @PutMapping("/{id}")
    public UsuarioModel actualizar(@PathVariable Long id, @RequestBody UsuarioModel usuario) {
        usuario.setId(id);
        return usuarioService.guardarUsuario(usuario);
    }

    @Operation(summary = "Eliminar usuario")
    @ApiResponse(responseCode = "200", description = "Usuario eliminado")
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
        return "Usuario eliminado correctamente";
    }
}
