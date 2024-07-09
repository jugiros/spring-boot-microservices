package com.formacionbdi.springboot.app.productos.springboot_servicio_productos.controllers;

import com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductoController {

    @Autowired
    private Environment env;

    @Value("${server.port}")
    private Integer port;

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.findAll().stream().map(producto -> {
//            producto.setPuerto(Integer.parseInt(env.getProperty("local.server.port")));
            producto.setPuerto(port);
            return producto;
        }).collect(Collectors.toList());
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable  Long id) {
        Producto producto = productoService.findById(id);
//        producto.setPuerto(Integer.parseInt(env.getProperty("local.server.port")));
        producto.setPuerto(port);
        return producto;
    }
}
