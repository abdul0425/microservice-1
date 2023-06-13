package com.mehmed.arsalan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.arsalan.model.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel, Integer> {

}
