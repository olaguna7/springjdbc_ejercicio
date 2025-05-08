package com.oscar.springjdbc_ejercicio.controller;

import com.oscar.springjdbc_ejercicio.model.Oficina;
import com.oscar.springjdbc_ejercicio.service.EmpleadoService;
import com.oscar.springjdbc_ejercicio.service.OficinaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OficinaController {

    private final OficinaService oficinaService;
    private final EmpleadoService empleadoService;

    public OficinaController(OficinaService oficinaService, EmpleadoService empleadoService) {
        this.oficinaService = oficinaService;
        this.empleadoService = empleadoService;
    }

    @GetMapping("/oficinas")
    public String listaOficinas(Model model) {
        model.addAttribute("titulo", "Lista de oficinas");
        model.addAttribute("oficinas", oficinaService.findAll());
        return "ListaOficinas";
    }

    @GetMapping("/oficinas/{id}")
    public String showOficina(Model model, @PathVariable String id) {
        Oficina oficina = oficinaService.findById(id).orElse(new Oficina());
        model.addAttribute("oficina", oficina);
        model.addAttribute("empleados", empleadoService.buscarEmpleadoPorOficina(id));
        return "editarOficina";
    }

}
