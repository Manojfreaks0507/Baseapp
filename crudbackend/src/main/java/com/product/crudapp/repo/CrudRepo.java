package com.product.crudapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.crudapp.model.Product;

public interface CrudRepo extends JpaRepository<Product, Double> {
 
}
