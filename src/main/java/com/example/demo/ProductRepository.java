package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    // هو لوحده فهم كل حاجة، مش محتاجة تكتبي كود هنا!
}