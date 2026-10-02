package com.mayank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayank.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
