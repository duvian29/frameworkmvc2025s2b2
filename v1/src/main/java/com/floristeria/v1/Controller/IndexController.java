package com.floristeria.v1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index/home")
public class IndexController {

    @GetMapping("")
    public String index() {
        return "home/index";
    }

    @GetMapping("/mision")
    public String mision() {
        return "home/mision";
    }

    @GetMapping("/vision")
    public String vision() {
        return "home/vision";
    }

    @GetMapping("/valores")
    public String valores() {
        return "home/valores";
    }

    @GetMapping("/servicios")
    public String servicios() {
        return "home/servicios";
    }

    @GetMapping("/eventos")
    public String eventos() {
        return "home/eventos";
    }
}
