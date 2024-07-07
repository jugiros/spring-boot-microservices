package com.formacionbdi.springboot.item.models.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Producto {

    private Long id;
    private String nombre;
    private Double precio;
    private Date createAt;

}
