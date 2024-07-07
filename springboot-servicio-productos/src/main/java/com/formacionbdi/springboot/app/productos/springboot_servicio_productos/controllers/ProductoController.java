package com.formacionbdi.springboot.app.productos.springboot_servicio_productos.controllers;

import com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.findAll();
    }

    @GetMapping("/listar/{id}")
    public Producto detalle(@PathVariable  Long id) {
        return productoService.findById(id);
    }
}