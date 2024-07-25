package com.formacionbdi.springboot.item.models.service;

import com.formacionbdi.springboot.item.models.dto.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);

}
