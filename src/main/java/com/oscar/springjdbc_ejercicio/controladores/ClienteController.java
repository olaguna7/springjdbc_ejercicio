package com.oscar.springjdbc_ejercicio.controladores;

import com.oscar.springjdbc_ejercicio.entidades.Cliente;
import com.oscar.springjdbc_ejercicio.entidades.Empleado;
import com.oscar.springjdbc_ejercicio.servicios.ClienteService;
import com.oscar.springjdbc_ejercicio.servicios.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ClienteController {

    private final ClienteService clienteService;
    private final EmpleadoService empleadoService;

    public ClienteController(ClienteService clienteService, EmpleadoService empleadoService) {
        this.clienteService = clienteService;
        this.empleadoService = empleadoService;
    }

    @GetMapping("/clientes")
    public String listaClientes(Model model) {
        model.addAttribute("titulo", "Lista de Clientes");
        model.addAttribute("clientes", clienteService.listarClientes());
        return "listaClientes";
    }

    @GetMapping("/clientes/{id}")
    public String mostrarCliente(Model model, @PathVariable int id) {
        model.addAttribute("titulo", "Modificar Cliente " + id);
        Cliente cliente = clienteService.buscarClientePorId(id).orElse(new Cliente());
        model.addAttribute("cliente", cliente);
        Empleado empleado = empleadoService.buscarEmpleadoPorId(cliente.getCodigoRepresentanteVentas()).orElse(new Empleado());
        String representante = empleado.getNombre() + " " + empleado.getApellido1();
        model.addAttribute("representante", representante);
        model.addAttribute("listaRepresentantes", empleadoService.listarEmpleados());
        return "fichaCliente";
    }
}
