package com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.service;

import com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
}
