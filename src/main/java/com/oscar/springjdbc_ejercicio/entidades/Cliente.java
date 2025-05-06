package com.oscar.springjdbc_ejercicio.entidades;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private int codigoCliente;
    private String nombreCliente;
    private String nombreContacto;
    private String apellidoContacto;
    private String telefono;
    private String fax;
    private String lineaDireccion1;
    private String lineaDireccion2;
    private String ciudad;
    private String region;
    private String pais;
    private String codigoPostal;
    private Integer codigoRepresentanteVentas;
    private Double limiteCredito;

    @Override
    public String toString() {
        return "Cliente: " + nombreCliente + " telefono: " + telefono;
    }
}
