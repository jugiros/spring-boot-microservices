package com.formacionbdi.springboot.item.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private Producto producto;
    private Integer cantidad;

    public Item(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Item() {
    }

    public Double getTotal() {
        return producto.getPrecio() * cantidad.doubleValue();
    }
}
