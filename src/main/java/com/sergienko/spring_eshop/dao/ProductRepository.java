package com.sergienko.spring_eshop.dao;

import com.sergienko.spring_eshop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
