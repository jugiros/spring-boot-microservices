package com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.service;

import com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.entity.Producto;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProductoService {


    public List<Producto> findAll();
    public Producto findById(Long id);
}
