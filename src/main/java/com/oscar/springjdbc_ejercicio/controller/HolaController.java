package com.oscar.springjdbc_ejercicio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

    @GetMapping("/saludo") // Mapea las peticiones GET a /saludo a este metodo
    public String mostrarPaginaHola(Model model) {
        // Agrega el titulo al modelo para que esté disponible en la plantilla Thymeleaf
        model.addAttribute("titulo", "Hola a todo el mundo");
        // Devuelve el nombre de la plantilla HTML (sin la extensión .html)
        return "paginaHola";
    }
}
