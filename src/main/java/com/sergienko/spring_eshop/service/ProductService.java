package com.sergienko.spring_eshop.service;

import com.sergienko.spring_eshop.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAll();
}
