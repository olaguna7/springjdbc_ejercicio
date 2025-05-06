package com.oscar.springjdbc_ejercicio.controladores;

import com.oscar.springjdbc_ejercicio.servicios.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public String listaClientes(Model model) {
        model.addAttribute("titulo", "Lista de Clientes");
        model.addAttribute("clientes", clienteService.listarClientes());
        return "listaClientes";
    }
}
