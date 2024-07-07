package com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.repository;

import com.formacionbdi.springboot.app.productos.springboot_servicio_productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
}
