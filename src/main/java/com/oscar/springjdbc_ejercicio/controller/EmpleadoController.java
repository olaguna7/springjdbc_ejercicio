package com.oscar.springjdbc_ejercicio.controller;


import com.oscar.springjdbc_ejercicio.model.Empleado;
import com.oscar.springjdbc_ejercicio.model.Oficina;
import com.oscar.springjdbc_ejercicio.service.EmpleadoService;
import com.oscar.springjdbc_ejercicio.service.OficinaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmpleadoController {

    private final EmpleadoService empleadoService;
    private final OficinaService oficinaService;

    public EmpleadoController(EmpleadoService empleadoService, OficinaService oficinaService) {
        this.empleadoService = empleadoService;
        this.oficinaService = oficinaService;
    }

    @GetMapping("/empleados")
    public String listaClientes(Model model) {
        model.addAttribute("titulo", "Lista de empleados");
        model.addAttribute("empleados", empleadoService.listarEmpleados());
        return "listaEmpleados";
    }

    @GetMapping("/empleados/{id}")
    public String mostrarEmpleadoById(@PathVariable int id, Model model) {
        Empleado empleado = empleadoService.buscarEmpleadoPorId(id).orElse(new Empleado());
        model.addAttribute("empleado", empleado);
        Iterable<Oficina> oficinas = oficinaService.listarOficinas();
        Oficina oficina = oficinaService.findById(empleado.getCodigoOficina()).orElse(new Oficina());
        model.addAttribute("oficinas", oficinas);
        model.addAttribute("oficinaEmpleado", oficina);
        model.addAttribute("empleados", empleadoService.buscarEmpleadoPorOficina(empleado.getCodigoOficina()));
        return "editarEmpleados";
    }
}
