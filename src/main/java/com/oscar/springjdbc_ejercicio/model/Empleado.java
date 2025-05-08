package com.oscar.springjdbc_ejercicio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table("empleado")
public class Empleado {
    @Id
    @Column("codigo_empleado")
    private int codigoEmpleado;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String extension;
    private String email;
    @Column("codigo_oficina")
    private String codigoOficina;
    @Column("codigo_jefe")
    private int codigoJefe;
    private String puesto;

    public String getNombreCompleto() {
        return nombre + " " + apellido1;
    }
}
