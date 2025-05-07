package com.oscar.springjdbc_ejercicio.controladores;


import com.oscar.springjdbc_ejercicio.servicios.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/empleados")
    public String listaClientes(Model model) {
        model.addAttribute("titulo", "Lista de empleados");
        model.addAttribute("empleados", empleadoService.listarEmpleados());
        return "listaEmpleados";
    }
}
