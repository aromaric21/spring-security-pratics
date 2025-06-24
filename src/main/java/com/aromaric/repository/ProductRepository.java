package com.aromaric.repository;

import com.aromaric.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long>{
}
