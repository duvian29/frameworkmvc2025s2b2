package com.floristeria.v1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clases")
public class ClasesController {

    @GetMapping("/listar")
    public String listarEstudiantes() {
        return "clases/listar";
    }

    @GetMapping("/horario/estudiantes")
    public String horarioEstudiantes() {
        return "clases/horarioEstudiantes";
    }

    @GetMapping("/horario/instructor")
    public String horarioInstructor() {
        return "clases/horarioInstructor";
    }
}
