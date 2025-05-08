package com.oscar.springjdbc_ejercicio.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table("cliente")
public class Cliente {
    @Id
    @Column("codigo_cliente")
    private int codigoCliente;
    @Column("nombre_cliente")
    private String nombreCliente;
    @Column("nombre_contacto")
    private String nombreContacto;
    @Column("apellido_contacto")
    private String apellidoContacto;
    private String telefono;
    private String fax;
    @Column("linea_direccion1")
    private String lineaDireccion1;
    @Column("linea_direccion2")
    private String lineaDireccion2;
    private String ciudad;
    private String region;
    private String pais;
    @Column("codigo_postal")
    private String codigoPostal;
    @Column("codigo_empleado_rep_ventas")
    private Integer codigoRepresentanteVentas;
    @Column("limite_credito")
    private Double limiteCredito;

    @Override
    public String toString() {
        return "Cliente: " + nombreCliente + " telefono: " + telefono;
    }
}
