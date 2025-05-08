package com.oscar.springjdbc_ejercicio.controller;

import com.oscar.springjdbc_ejercicio.model.Cliente;
import com.oscar.springjdbc_ejercicio.model.Empleado;
import com.oscar.springjdbc_ejercicio.service.ClienteService;
import com.oscar.springjdbc_ejercicio.service.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ClienteController {

    private final ClienteService clienteService;
    private final EmpleadoService empleadoService;

    public ClienteController(ClienteService clienteService, EmpleadoService empleadoService) {
        this.clienteService = clienteService;
        this.empleadoService = empleadoService;
    }

    @GetMapping("/clientes")
    public String showAllClientes(Model model) {
        model.addAttribute("titulo", "Lista de Clientes");
        model.addAttribute("clientes", clienteService.findAll());
        return "listaClientes";
    }

    @GetMapping("/clientes/{id}")
    public String mostrarCliente(Model model, @PathVariable int id) {
        model.addAttribute("titulo", "Modificar Cliente " + id);
        Cliente cliente = clienteService.getClienteByCodigoCliente(id).orElse(new Cliente());
        model.addAttribute("cliente", cliente);
        Empleado empleado = empleadoService.buscarEmpleadoPorId(cliente.getCodigoRepresentanteVentas()).orElse(new Empleado());
        String representante = empleado.getNombre() + " " + empleado.getApellido1();
        model.addAttribute("representante", representante);
        model.addAttribute("listaRepresentantes", empleadoService.listarEmpleados());
        return "fichaCliente";
    }

    @GetMapping("/empleados/{codOfi}")
    public String empleadosOficina(Model model, @PathVariable String codOfi) {
        List<Empleado> listaEmpleadosOficina = empleadoService.buscarEmpleadoPorOficina(codOfi);
        listaEmpleadosOficina.forEach(empleado -> {
            System.out.println();
        });
        return "empleadosOficina";
    }
}
