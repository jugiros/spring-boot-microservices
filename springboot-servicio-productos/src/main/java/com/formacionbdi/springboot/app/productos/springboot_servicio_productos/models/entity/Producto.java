package com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    // Se usa column solo en el caso de que la columna en la base de datos tenga otro nombre
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    @Transient
    private Integer puerto;

}
