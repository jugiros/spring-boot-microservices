package com.formacionbdi.springboot.item.models.service;

import com.formacionbdi.springboot.item.models.dto.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);

}
