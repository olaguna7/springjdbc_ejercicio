package com.oscar.springjdbc_ejercicio.controladores;

import com.oscar.springjdbc_ejercicio.servicios.OficinaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OficinaController {

    private final OficinaService oficinaService;

    public OficinaController(OficinaService oficinaService) {
        this.oficinaService = oficinaService;
    }

    @GetMapping("/oficinas")
    public String listaOficinas(Model model) {
        model.addAttribute("titulo", "Lista de oficinas");
        model.addAttribute("oficinas", oficinaService.listarOficinas());
        return "ListaOficinas";
    }

}
